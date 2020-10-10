package com.cognizant.cosmos.datajpa.core.datajpa.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.cognizant.cosmos.datajpa.core.datajpa.dao.DatajpaCoreDao;

@Configuration
@ComponentScan(basePackages = "com.cognizant.cosmos.datajpa.core.datajpa.service")
public class TestConfiguration {
  @MockBean public DatajpaCoreDao datajpaCoreDao;
}
