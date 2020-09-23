package com.cognizant.cosmos.core.demo.api;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.cognizant.cosmos.core.utils.execution.ServiceRequestContext;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.cognizant.cosmos.core.demo.api.controller.DemoTestCoreServiceController;
import com.cognizant.cosmos.core.demo.model.Frequency;
import com.cognizant.cosmos.core.demo.model.Account;
import com.cognizant.cosmos.core.demo.model.TransferType;
import com.cognizant.cosmos.core.demo.model.Profile;
import com.cognizant.cosmos.core.demo.service.DemoTestCoreService;

@RunWith(SpringRunner.class)
@WebMvcTest(DemoTestCoreServiceController.class)
@PropertySource("classpath:log.messages")
public class DemoTestCoreServiceControllerTest {

  @Autowired private MockMvc mockMvc;
  @MockBean private DemoTestCoreService demoTestCoreService;
  private ObjectMapper mapper = new ObjectMapper();

  private static final Object DEFAULT_RETURN = 1;

  private static final int DEFAULT_ID = 111;
  private static final String DEFAULT_DESCRIPTION = "description";

  private static final double DEFAULT_TRANSFER_AMOUNT = 111.10;
  private static final Date DEFAULT_TRANSFER_DATE = new Date();
  private static final String DEFAULT_TRANSFER_MEMO = "transfer_memo";
  private static final TransferType DEFAULT_TRANSFER_TYPE = null;
  private static final Frequency DEFAULT_TRANSFER_FREQUENCY = null;
  private static final Account DEFAULT_TARGET_ACCOUNT = null;
  private static final Account DEFAULT_SOURCE_ACCOUNT = null;

  private Frequency defaultFrequency() {
    Frequency frequency = new Frequency();
    frequency.setId(DEFAULT_ID);
    frequency.setDescription(DEFAULT_DESCRIPTION);
    return frequency;
  }

  @Test
  public void testGetTransferFrequencies() throws Exception {
    Mockito.when(
            demoTestCoreService.getTransferFrequencies(Mockito.any(ServiceRequestContext.class)))
        .thenReturn(Arrays.asList(defaultFrequency()));
    mockMvc
        .perform(
            MockMvcRequestBuilders.get("/frequencies")
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .contentType(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()))
        .andDo(MockMvcResultHandlers.print());
  }

  private Profile defaultProfile() {
    Profile profile = new Profile();
    profile.setId(DEFAULT_ID);
    profile.setTransferAmount(DEFAULT_TRANSFER_AMOUNT);
    profile.setTransferDate(DEFAULT_TRANSFER_DATE);
    profile.setTransferMemo(DEFAULT_TRANSFER_MEMO);
    profile.setTransferType(DEFAULT_TRANSFER_TYPE);
    profile.setTransferFrequency(DEFAULT_TRANSFER_FREQUENCY);
    profile.setTargetAccount(DEFAULT_TARGET_ACCOUNT);
    profile.setSourceAccount(DEFAULT_SOURCE_ACCOUNT);
    return profile;
  }

  @Test
  public void testGetTransferProfiles() throws Exception {
    Mockito.when(demoTestCoreService.getTransferProfiles(Mockito.any(ServiceRequestContext.class)))
        .thenReturn(Arrays.asList(defaultProfile()));
    mockMvc
        .perform(
            MockMvcRequestBuilders.get("/profiles")
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .contentType(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()))
        .andDo(MockMvcResultHandlers.print());
  }

  @Test
  public void testCreateTransferProfile() throws Exception {
    Mockito.doNothing()
        .when(demoTestCoreService)
        .createTransferProfile(Mockito.any(ServiceRequestContext.class));
    java.lang.String requestBody = mapper.writeValueAsString(defaultProfile());
    mockMvc
        .perform(
            MockMvcRequestBuilders.post("/profiles")
                .content(requestBody)
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .contentType(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(MockMvcResultMatchers.status().is(HttpStatus.CREATED.value()))
        .andDo(MockMvcResultHandlers.print());
  }

  private TransferType defaultTransferType() {
    TransferType transferType = new TransferType();
    transferType.setId(DEFAULT_ID);
    transferType.setDescription(DEFAULT_DESCRIPTION);
    return transferType;
  }

  @Test
  public void testGetTransferTypes() throws Exception {
    Mockito.when(demoTestCoreService.getTransferTypes(Mockito.any(ServiceRequestContext.class)))
        .thenReturn(Arrays.asList(defaultTransferType()));
    mockMvc
        .perform(
            MockMvcRequestBuilders.get("/types")
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .contentType(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()))
        .andDo(MockMvcResultHandlers.print());
  }
}
