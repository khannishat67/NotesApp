package com.cognizant.cosmos.datajpa.core.datajpa.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cognizant.cosmos.datajpa.core.datajpa.dao.DatajpaCoreDao;
import com.cognizant.cosmos.datajpa.core.datajpa.service.config.TestConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class DatajpaCoreServiceTest {

  @Autowired private DatajpaCoreService datajpaCoreService;

  @Test
  public void testGetTransferFrequencies() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetTransferProfiles() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testCreateTransferProfile() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetTransferTypes() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }
}
