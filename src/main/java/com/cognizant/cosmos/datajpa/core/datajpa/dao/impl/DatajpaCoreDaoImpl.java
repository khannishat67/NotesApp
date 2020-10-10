package com.cognizant.cosmos.datajpa.core.datajpa.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.cosmos.datajpa.core.datajpa.dao.DatajpaCoreDao;
import com.cognizant.cosmos.datajpa.core.datajpa.model.*;
import com.google.cloud.spanner.Key;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class DatajpaCoreDaoImpl implements DatajpaCoreDao {

  private final SpannerTemplate spannerTemplate;

  public List<Frequency> getTransferFrequencies() {
    // TODO: your code goes here...
    return null;
  }

  public List<Profile> getTransferProfiles() {
    // TODO: your code goes here...
    return null;
  }

  public void createTransferProfile(Profile body) {
    // TODO: your code goes here...
  }

  public List<TransferType> getTransferTypes() {
    // TODO: your code goes here...
    return null;
  }
}
