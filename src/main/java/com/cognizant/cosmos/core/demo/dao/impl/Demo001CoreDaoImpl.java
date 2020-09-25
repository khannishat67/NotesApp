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

import com.cognizant.cosmos.core.demo.dao.Demo001CoreDao;
import java.util.*;

/** Name:-Demo001CoreDaoImpl */
@Repository
public class Demo001CoreDaoImpl implements Demo001CoreDao {

  private static final Logger LOG = LoggerFactory.getLogger(Demo001CoreDaoImpl.class);

  @Autowired private Environment env;
}
