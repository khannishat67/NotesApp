package com.cognizant.cosmos.datajpa.core.datajpa.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import com.cognizant.cosmos.datajpa.core.datajpa.dao.DatajpaCoreDao;
import com.cognizant.cosmos.datajpa.core.datajpa.model.*;
import com.cognizant.cosmos.datajpa.core.datajpa.service.DatajpaCoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class DatajpaCoreServiceImpl implements DatajpaCoreService {

  private final DatajpaCoreDao datajpaCoreDao;

  @Override
  public List<Frequency> getTransferFrequencies() {
    // HINT: your code goes here...
    return datajpaCoreDao.getTransferFrequencies();
  }

  @Override
  public List<Profile> getTransferProfiles() {
    // HINT: your code goes here...
    return datajpaCoreDao.getTransferProfiles();
  }

  @Override
  public void createTransferProfile(Profile body) {
    // HINT: your code goes here...
    datajpaCoreDao.createTransferProfile(body);
  }

  @Override
  public List<TransferType> getTransferTypes() {
    // HINT: your code goes here...
    return datajpaCoreDao.getTransferTypes();
  }
}
