package com.cognizant.cosmos.datajpa.core.datajpa.exception.impl;

import java.net.URI;
import java.util.Arrays;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.aspectj.lang.JoinPoint;
import org.zalando.problem.Problem;
import org.zalando.problem.Status;

import com.cognizant.cosmos.core.utils.execution.ServiceContextUtil;
import com.cognizant.cosmos.core.utils.exception.ExceptionHandler;

import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataExceptionHandler implements ExceptionHandler, ServiceContextUtil {

  @Override
  public void handleException(JoinPoint joinPoint, Throwable error) {
    String className = joinPoint.getSignature().getDeclaringTypeName();
    Object[] arguments = joinPoint.getArgs();
    String methodName = joinPoint.getSignature().getName();
    log.info(
        "aspect triggered for class: {} method: {} with argument[s]: {}",
        className,
        methodName,
        Arrays.toString(arguments));
    // HINT: your code goes here...
    Throwable throwable = ExceptionUtils.getRootCause(error);
    StatusRuntimeException sre = null;
    if (throwable instanceof io.grpc.StatusRuntimeException) {
      sre = (StatusRuntimeException) throwable;
      throw Problem.builder()
          .withType(URI.create(getServiceRequestContext().getUrl()))
          .withTitle("data access exception: " + sre.getStatus().getCode())
          .withStatus(Status.BAD_REQUEST)
          .withDetail(sre.getMessage())
          .build();
    } else {
      throw Problem.builder()
          .withType(URI.create(getServiceRequestContext().getUrl()))
          .withTitle("data access exception")
          .withStatus(Status.BAD_REQUEST)
          .withDetail(error.getMessage())
          .build();
    }
  }
}
