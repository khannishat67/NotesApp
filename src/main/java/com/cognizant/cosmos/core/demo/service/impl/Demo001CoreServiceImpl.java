package com.cognizant.cosmos.core.demo.service.impl;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.cognizant.cosmos.core.utils.execution.ServiceRequestContext;
import com.cognizant.cosmos.core.demo.dao.Demo001CoreDao;
import com.cognizant.cosmos.core.demo.model.*;
import com.cognizant.cosmos.core.demo.service.Demo001CoreService;

/** */
@Service("demo001CoreService")
public class Demo001CoreServiceImpl implements Demo001CoreService {

  private static final Logger LOG = LoggerFactory.getLogger(Demo001CoreServiceImpl.class);

  @Autowired private Environment env;

  @Autowired private Demo001CoreDao demo001CoreDao;

  @Override
  public List<Frequency> getTransferFrequencies(ServiceRequestContext context) {
    LOG.info(env.getProperty("demo-001-service.log.message.key.1"));
    // TODO

    // TODO
    return null;
  }

  @Override
  public List<Profile> getTransferProfiles(ServiceRequestContext context) {
    LOG.info(env.getProperty("demo-001-service.log.message.key.2"));
    // TODO

    // TODO
    return null;
  }

  @Override
  public void createTransferProfile(ServiceRequestContext context) {
    LOG.info(env.getProperty("demo-001-service.log.message.key.3"));
    // TODO

    // TODO
  }

  @Override
  public List<TransferType> getTransferTypes(ServiceRequestContext context) {
    LOG.info(env.getProperty("demo-001-service.log.message.key.4"));
    // TODO

    // TODO
    return null;
  }
}
