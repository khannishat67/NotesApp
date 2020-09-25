package com.cognizant.cosmos.composite.demo.api;

import com.cognizant.cosmos.core.utils.execution.ServiceRequestContext;
import com.cognizant.cosmos.core.utils.execution.ServiceResponseContext;

/** */
public interface IDemo001CompositeService {

  ServiceResponseContext getTransferFrequencies(ServiceRequestContext context);

  ServiceResponseContext getTransferProfiles(ServiceRequestContext context);

  ServiceResponseContext createTransferProfile(ServiceRequestContext context);

  ServiceResponseContext getTransferTypes(ServiceRequestContext context);
}
