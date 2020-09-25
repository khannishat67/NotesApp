package com.cognizant.cosmos.composite.demo.api.delegator;

import com.cognizant.cosmos.composite.demo.api.IDemo001CompositeService;
import com.cognizant.cosmos.composite.demo.api.helper.IDemo001CompositeServiceHelper;
import com.cognizant.cosmos.composite.demo.api.helper.IDemo001CoreServiceHelper;
import com.cognizant.cosmos.core.utils.FutureUtils;
import com.cognizant.cosmos.core.utils.execution.ServiceExecution;
import com.cognizant.cosmos.core.utils.execution.ServiceRequestContext;
import com.cognizant.cosmos.core.utils.execution.ServiceResponseContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Demo001CompositeServiceDelegator implements IDemo001CompositeService {
  private static final Logger LOG = LoggerFactory.getLogger(Demo001CompositeServiceDelegator.class);

  @Autowired private FutureUtils futureUtils;

  @Autowired private Environment env;

  @Autowired private IDemo001CompositeServiceHelper demo001CompositeServiceHelper;

  @Autowired private IDemo001CoreServiceHelper demo001CoreServiceHelper;

  public ServiceResponseContext getTransferFrequencies(
      ServiceRequestContext serviceRequestContext) {
    ServiceExecution execution = new ServiceExecution(serviceRequestContext);
    demo001CompositeServiceHelper.processGetTransferFrequenciesRequest(execution);
    if (execution.getServiceCall("774f74d4-df62-4db4-8726-ef01a317d573")) {
      LOG.info(env.getProperty("demo001-composite-service-delegator.log.message.key.1"));
      execution.setServiceCallResult(
          "774f74d4-df62-4db4-8726-ef01a317d573",
          demo001CoreServiceHelper.processGetTransferFrequenciesResponse(
              "774f74d4-df62-4db4-8726-ef01a317d573",
              execution,
              demo001CoreServiceHelper.getTransferFrequencies(
                  demo001CoreServiceHelper.processGetTransferFrequenciesRequest(
                      "774f74d4-df62-4db4-8726-ef01a317d573",
                      execution,
                      "GetTransferFrequencies"))));
    } else {
      LOG.info(env.getProperty("demo001-composite-service-delegator.log.message.key.2"));
    }
    return demo001CompositeServiceHelper.processGetTransferFrequenciesResponse(execution);
  }

  public ServiceResponseContext getTransferProfiles(ServiceRequestContext serviceRequestContext) {
    ServiceExecution execution = new ServiceExecution(serviceRequestContext);
    demo001CompositeServiceHelper.processGetTransferProfilesRequest(execution);
    if (execution.getServiceCall("4f21d5af-1d46-460b-b4f2-6b07a3b853b1")) {
      LOG.info(env.getProperty("demo001-composite-service-delegator.log.message.key.3"));
      execution.setServiceCallResult(
          "4f21d5af-1d46-460b-b4f2-6b07a3b853b1",
          demo001CoreServiceHelper.processGetTransferProfilesResponse(
              "4f21d5af-1d46-460b-b4f2-6b07a3b853b1",
              execution,
              demo001CoreServiceHelper.getTransferProfiles(
                  demo001CoreServiceHelper.processGetTransferProfilesRequest(
                      "4f21d5af-1d46-460b-b4f2-6b07a3b853b1", execution, "GetTransferProfiles"))));
    } else {
      LOG.info(env.getProperty("demo001-composite-service-delegator.log.message.key.4"));
    }
    return demo001CompositeServiceHelper.processGetTransferProfilesResponse(execution);
  }

  public ServiceResponseContext createTransferProfile(ServiceRequestContext serviceRequestContext) {
    ServiceExecution execution = new ServiceExecution(serviceRequestContext);
    demo001CompositeServiceHelper.processCreateTransferProfileRequest(execution);
    return demo001CompositeServiceHelper.processCreateTransferProfileResponse(execution);
  }

  public ServiceResponseContext getTransferTypes(ServiceRequestContext serviceRequestContext) {
    ServiceExecution execution = new ServiceExecution(serviceRequestContext);
    demo001CompositeServiceHelper.processGetTransferTypesRequest(execution);
    return demo001CompositeServiceHelper.processGetTransferTypesResponse(execution);
  }
}
