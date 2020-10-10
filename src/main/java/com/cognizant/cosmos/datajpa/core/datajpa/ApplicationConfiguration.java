package com.cognizant.cosmos.datajpa.core.datajpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EntityScan(basePackages = {"com.cognizant.cosmos.datajpa.core.datajpa.dao.entity"})
@ImportResource("classpath:app-config.xml")
public class ApplicationConfiguration {}
