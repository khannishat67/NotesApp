package com.cognizant.cosmos.composite.demo.api.helper.impl;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.cognizant.cosmos.core.utils.execution.ServiceData;
import com.cognizant.cosmos.core.utils.execution.ServiceExecution;
import com.cognizant.cosmos.core.utils.execution.ServiceRequestContext;

import com.cognizant.cosmos.composite.demo.api.helper.IDemo001CoreServiceHelper;
import com.cognizant.cosmos.composite.demo.api.helper.AbstractDemo001CoreServiceHelper;
import com.cognizant.cosmos.composite.demo.model.*;

@Component
public class Demo001CoreServiceHelper extends AbstractDemo001CoreServiceHelper {

  private static final Logger LOG = LoggerFactory.getLogger(Demo001CoreServiceHelper.class);

  @Autowired private Environment env;

  @Override
  public ServiceData processGetTransferFrequenciesRequest(
      String stepIdentifier, ServiceExecution execution, Object... args) {
    ServiceData serviceData = new ServiceData();
    ServiceRequestContext serviceRequestContext = new ServiceRequestContext();
    // TODO: your code goes here

    serviceData.setServiceRequestContext(serviceRequestContext);
    return serviceData;
  }

  @Override
  public ServiceData processGetTransferFrequenciesResponse(
      String stepIdentifier, ServiceExecution execution, ServiceData serviceData) {
    // TODO: your code goes here

    return serviceData;
  }

  @Override
  public ServiceData processGetTransferFrequenciesFallback(
      ServiceData serviceData, Throwable throwable) {
    serviceData.setFallbackFlag(true);
    serviceData.setThrowable(throwable);
    serviceData.setServiceResponseContext(null);
    return serviceData;
  }

  @Override
  public ServiceData processGetTransferProfilesRequest(
      String stepIdentifier, ServiceExecution execution, Object... args) {
    ServiceData serviceData = new ServiceData();
    ServiceRequestContext serviceRequestContext = new ServiceRequestContext();
    // TODO: your code goes here

    serviceData.setServiceRequestContext(serviceRequestContext);
    return serviceData;
  }

  @Override
  public ServiceData processGetTransferProfilesResponse(
      String stepIdentifier, ServiceExecution execution, ServiceData serviceData) {
    // TODO: your code goes here

    return serviceData;
  }

  @Override
  public ServiceData processGetTransferProfilesFallback(
      ServiceData serviceData, Throwable throwable) {
    serviceData.setFallbackFlag(true);
    serviceData.setThrowable(throwable);
    serviceData.setServiceResponseContext(null);
    return serviceData;
  }
}
