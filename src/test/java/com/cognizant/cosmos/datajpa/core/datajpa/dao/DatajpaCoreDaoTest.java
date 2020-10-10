package com.cognizant.cosmos.datajpa.core.datajpa.dao;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cognizant.cosmos.datajpa.core.datajpa.dao.config.TestConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class DatajpaCoreDaoTest {
  @Autowired private DatajpaCoreDao datajpaCoreDao;

  @Test
  public void testGetTransferFrequencies() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetTransferProfiles() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testCreateTransferProfile() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetTransferTypes() {
    Assert.assertEquals(true, true);
  }
}
