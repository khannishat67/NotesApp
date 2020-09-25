package com.cognizant.cosmos.composite.demo.api.controller;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.util.*;
import org.springframework.web.bind.annotation.*;

import com.cognizant.cosmos.core.utils.execution.ServiceRequestContext;

import com.cognizant.cosmos.composite.demo.model.*;
import com.cognizant.cosmos.composite.demo.api.IDemo001CompositeService;

import io.swagger.annotations.*;
import springfox.documentation.annotations.ApiIgnore;

/** */
@RestController
@Api("instruction-service")
public class Demo001CompositeServiceController {

  private static final Logger LOG =
      LoggerFactory.getLogger(Demo001CompositeServiceController.class);
  @Autowired private Environment env;
  @Autowired private IDemo001CompositeService demo001CompositeService;

  /** */
  @GetMapping(
      value = "/frequencies",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "Find transfer frequencies", tags = "", response = Frequency.class)
  @ApiResponses({@ApiResponse(code = 200, message = "transfer frequencies successfully returned")})
  public ResponseEntity<List<Frequency>> getTransferFrequencies(
      @ApiIgnore @RequestHeader(required = false) HttpHeaders headers,
      @ApiIgnore @PathVariable(required = false) Map<String, String> pathParams,
      @ApiIgnore @RequestParam(required = false) MultiValueMap<String, String> queryParams) {

    LOG.info(env.getProperty("instruction-service.log.message.key.1"));
    List<Frequency> data =
        (List<Frequency>)
            demo001CompositeService
                .getTransferFrequencies(new ServiceRequestContext(headers, pathParams, queryParams))
                .getBody();
    if (!Objects.isNull(data) && !data.isEmpty()) {
      LOG.info(env.getProperty("instruction-service.log.message.key.2"));
      return new ResponseEntity<List<Frequency>>(data, HttpStatus.OK);
    } else {
      LOG.info(env.getProperty("instruction-service.log.message.key.3"));
      return new ResponseEntity<List<Frequency>>(HttpStatus.NOT_FOUND);
    }
  }

  /** */
  @GetMapping(
      value = "/profiles",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "Find transfer profiles", tags = "", response = Profile.class)
  @ApiResponses({@ApiResponse(code = 200, message = "transfer profiles successfully returned")})
  public ResponseEntity<List<Profile>> getTransferProfiles(
      @ApiIgnore @RequestHeader(required = false) HttpHeaders headers,
      @ApiIgnore @PathVariable(required = false) Map<String, String> pathParams,
      @ApiIgnore @RequestParam(required = false) MultiValueMap<String, String> queryParams) {

    LOG.info(env.getProperty("instruction-service.log.message.key.4"));
    List<Profile> data =
        (List<Profile>)
            demo001CompositeService
                .getTransferProfiles(new ServiceRequestContext(headers, pathParams, queryParams))
                .getBody();
    if (!Objects.isNull(data) && !data.isEmpty()) {
      LOG.info(env.getProperty("instruction-service.log.message.key.2"));
      return new ResponseEntity<List<Profile>>(data, HttpStatus.OK);
    } else {
      LOG.info(env.getProperty("instruction-service.log.message.key.3"));
      return new ResponseEntity<List<Profile>>(HttpStatus.NOT_FOUND);
    }
  }

  /** */
  @PostMapping(
      value = "/profiles",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "Create a transfer profile", tags = "", response = Void.class)
  @ApiResponses({@ApiResponse(code = 201, message = "Transfer profiles successfully created")})
  public ResponseEntity<Void> createTransferProfile(
      @ApiParam(value = "The transfer profile to create", required = true) @RequestBody
          Profile body,
      @ApiIgnore @RequestHeader(required = false) HttpHeaders headers,
      @ApiIgnore @PathVariable(required = false) Map<String, String> pathParams,
      @ApiIgnore @RequestParam(required = false) MultiValueMap<String, String> queryParams) {

    LOG.info(env.getProperty("instruction-service.log.message.key.5"));
    demo001CompositeService.createTransferProfile(
        new ServiceRequestContext(headers, pathParams, queryParams, body));
    return new ResponseEntity<Void>(HttpStatus.CREATED);
  }

  /** */
  @GetMapping(
      value = "/types",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "Find transfer types", tags = "", response = TransferType.class)
  @ApiResponses({@ApiResponse(code = 200, message = "transfer types successfully returned")})
  public ResponseEntity<List<TransferType>> getTransferTypes(
      @ApiIgnore @RequestHeader(required = false) HttpHeaders headers,
      @ApiIgnore @PathVariable(required = false) Map<String, String> pathParams,
      @ApiIgnore @RequestParam(required = false) MultiValueMap<String, String> queryParams) {

    LOG.info(env.getProperty("instruction-service.log.message.key.6"));
    List<TransferType> data =
        (List<TransferType>)
            demo001CompositeService
                .getTransferTypes(new ServiceRequestContext(headers, pathParams, queryParams))
                .getBody();
    if (!Objects.isNull(data) && !data.isEmpty()) {
      LOG.info(env.getProperty("instruction-service.log.message.key.2"));
      return new ResponseEntity<List<TransferType>>(data, HttpStatus.OK);
    } else {
      LOG.info(env.getProperty("instruction-service.log.message.key.3"));
      return new ResponseEntity<List<TransferType>>(HttpStatus.NOT_FOUND);
    }
  }
}
