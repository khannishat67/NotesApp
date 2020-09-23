package com.cognizant.cosmos.core.demo.dao.impl;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.cognizant.cosmos.core.demo.dao.DemoTestCoreDao;
import java.util.*;

/** Name:-DemoTestCoreDaoImpl */
@Repository
public class DemoTestCoreDaoImpl implements DemoTestCoreDao {

  private static final Logger LOG = LoggerFactory.getLogger(DemoTestCoreDaoImpl.class);

  @Autowired private Environment env;
}
