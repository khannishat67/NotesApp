package com.cognizant.cosmos.datajpa.core.datajpa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zalando.problem.Problem;
import org.zalando.problem.Status;

import com.cognizant.cosmos.core.utils.validation.CreateGroup;
import com.cognizant.cosmos.core.utils.validation.UpdateGroup;
import com.cognizant.cosmos.datajpa.core.datajpa.model.*;
import com.cognizant.cosmos.datajpa.core.datajpa.service.DatajpaCoreService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
/** */
@Slf4j
@RestController
@Api("instruction-service")
@RequiredArgsConstructor
public class DatajpaCoreServiceController {

  private final DatajpaCoreService datajpaCoreService;
  /** */
  @GetMapping(
      value = "/frequencies",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "Find transfer frequencies", tags = "", response = Frequency.class)
  @ApiResponses({@ApiResponse(code = 200, message = "transfer frequencies successfully returned")})
  public ResponseEntity<List<Frequency>> getTransferFrequencies() {

    List<Frequency> data = datajpaCoreService.getTransferFrequencies();
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  /** */
  @GetMapping(
      value = "/profiles",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "Find transfer profiles", tags = "", response = Profile.class)
  @ApiResponses({@ApiResponse(code = 200, message = "transfer profiles successfully returned")})
  public ResponseEntity<List<Profile>> getTransferProfiles() {

    List<Profile> data = datajpaCoreService.getTransferProfiles();
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
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
      @ApiParam(value = "The transfer profile to create", required = true)
          @Validated({CreateGroup.class})
          @RequestBody
          Profile body) {
    datajpaCoreService.createTransferProfile(body);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }
  /** */
  @GetMapping(
      value = "/types",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "Find transfer types", tags = "", response = TransferType.class)
  @ApiResponses({@ApiResponse(code = 200, message = "transfer types successfully returned")})
  public ResponseEntity<List<TransferType>> getTransferTypes() {

    List<TransferType> data = datajpaCoreService.getTransferTypes();
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}
