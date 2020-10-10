package com.cognizant.cosmos.datajpa.core.datajpa.exception.impl;

import java.net.URI;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.zalando.problem.Problem;
import org.zalando.problem.Status;
import org.zalando.problem.ThrowableProblem;

import com.cognizant.cosmos.core.utils.execution.ServiceContextUtil;
import com.cognizant.cosmos.core.utils.exception.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServiceExceptionHandler implements ExceptionHandler, ServiceContextUtil {

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
    if (error instanceof ThrowableProblem) {
      throw (ThrowableProblem) error;
    } else {
      throw Problem.builder()
          .withType(URI.create(getServiceRequestContext().getUrl()))
          .withTitle("service exception")
          .withStatus(Status.BAD_REQUEST)
          .withDetail(error.getMessage())
          .build();
    }
  }
}
