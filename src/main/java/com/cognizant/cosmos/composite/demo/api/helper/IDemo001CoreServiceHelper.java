package com.cognizant.cosmos.composite.demo.api.helper;

import com.cognizant.cosmos.core.utils.execution.ServiceData;
import com.cognizant.cosmos.core.utils.execution.ServiceExecution;

public interface IDemo001CoreServiceHelper {

  public ServiceData getTransferFrequencies(ServiceData serviceData);

  public ServiceData processGetTransferFrequenciesRequest(
      String stepIdentifier, ServiceExecution execution, Object... args);

  public ServiceData processGetTransferFrequenciesResponse(
      String stepIdentifier, ServiceExecution execution, ServiceData serviceData);

  public ServiceData processGetTransferFrequenciesFallback(
      ServiceData serviceData, Throwable throwable);

  public ServiceData getTransferProfiles(ServiceData serviceData);

  public ServiceData processGetTransferProfilesRequest(
      String stepIdentifier, ServiceExecution execution, Object... args);

  public ServiceData processGetTransferProfilesResponse(
      String stepIdentifier, ServiceExecution execution, ServiceData serviceData);

  public ServiceData processGetTransferProfilesFallback(
      ServiceData serviceData, Throwable throwable);
}
