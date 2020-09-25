package com.cognizant.cosmos.composite.demo.api.helper.impl;

import java.util.*;

import javax.validation.ValidationException;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.cosmos.core.utils.execution.ServiceExecution;
import com.cognizant.cosmos.core.utils.execution.ServiceResponseContext;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.cognizant.cosmos.composite.demo.api.helper.IDemo001CompositeServiceHelper;
import com.cognizant.cosmos.composite.demo.model.*;

@Component
public class Demo001CompositeServiceHelper implements IDemo001CompositeServiceHelper {

  private static final Logger LOG = LoggerFactory.getLogger(Demo001CompositeServiceHelper.class);

  @Autowired private ModelMapper modelMapper;

  @Autowired private ObjectMapper objectMapper;

  @Override
  public void processGetTransferFrequenciesRequest(ServiceExecution execution) {
    execution.setServiceCall("774f74d4-df62-4db4-8726-ef01a317d573", true);
    // TODO: your code goes here...
  }

  @Override
  public ServiceResponseContext processGetTransferFrequenciesResponse(ServiceExecution execution) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processGetTransferProfilesRequest(ServiceExecution execution) {
    execution.setServiceCall("4f21d5af-1d46-460b-b4f2-6b07a3b853b1", true);
    // TODO: your code goes here...
  }

  @Override
  public ServiceResponseContext processGetTransferProfilesResponse(ServiceExecution execution) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processCreateTransferProfileRequest(ServiceExecution execution) {
    // TODO: your code goes here...
  }

  @Override
  public ServiceResponseContext processCreateTransferProfileResponse(ServiceExecution execution) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processGetTransferTypesRequest(ServiceExecution execution) {
    // TODO: your code goes here...
  }

  @Override
  public ServiceResponseContext processGetTransferTypesResponse(ServiceExecution execution) {
    // TODO: your code goes here...
    return null;
  }
}
