package com.cognizant.cosmos.composite.demo.api.helper;

import com.cognizant.cosmos.core.utils.execution.ServiceExecution;
import com.cognizant.cosmos.core.utils.execution.ServiceResponseContext;

public interface IDemo001CompositeServiceHelper {

  public void processGetTransferFrequenciesRequest(ServiceExecution execution);

  public ServiceResponseContext processGetTransferFrequenciesResponse(ServiceExecution execution);

  public void processGetTransferProfilesRequest(ServiceExecution execution);

  public ServiceResponseContext processGetTransferProfilesResponse(ServiceExecution execution);

  public void processCreateTransferProfileRequest(ServiceExecution execution);

  public ServiceResponseContext processCreateTransferProfileResponse(ServiceExecution execution);

  public void processGetTransferTypesRequest(ServiceExecution execution);

  public ServiceResponseContext processGetTransferTypesResponse(ServiceExecution execution);
}
