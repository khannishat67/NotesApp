package com.cognizant.cosmos.composite.demo.api.helper;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.cognizant.cosmos.core.utils.IConstants;
import com.cognizant.cosmos.core.utils.execution.ServiceData;
import com.cognizant.cosmos.core.utils.execution.ServiceRequestContext;
import com.cognizant.cosmos.core.utils.execution.ServiceResponseContext;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import com.cognizant.cosmos.core.demo.model.*;

public abstract class AbstractDemo001CoreServiceHelper implements IDemo001CoreServiceHelper {

  private static final Logger LOG = LoggerFactory.getLogger(AbstractDemo001CoreServiceHelper.class);
  private static final String BASE_URI = "http://instruction-service/instruction-service/1.0";

  @Autowired
  @Qualifier(IConstants.BEAN_ID_LOAD_BALANCED_REST_TEMPLATE)
  private RestTemplate restTemplate;

  @Autowired private Environment env;

  /** */
  public String getServiceName() {
    return "instruction-service";
  }

  public String getServiceVersion() {
    return "1.0";
  }

  @Override
  @CircuitBreaker(
      name = "getTransferFrequencies",
      fallbackMethod = "processGetTransferFrequenciesFallback")
  public ServiceData getTransferFrequencies(ServiceData serviceData) {
    try {
      LOG.info(env.getProperty("abstract-demo001-core-service.log.message.key.1"));
      serviceData.setName(getServiceName());
      serviceData.setVersion(getServiceVersion());
      ServiceRequestContext serviceRequestContext = serviceData.getServiceRequestContext();
      serviceRequestContext.setUrl(
          UriComponentsBuilder.fromHttpUrl((BASE_URI + "/frequencies"))
              .queryParams(serviceRequestContext.getQueryParams())
              .toUriString());
      serviceRequestContext.setMethod(HttpMethod.GET.name());
      ResponseEntity<Frequency[]> responseEntity =
          restTemplate.exchange(
              serviceRequestContext.getUrl(),
              HttpMethod.GET,
              new HttpEntity<>(serviceRequestContext.getHttpHeaders()),
              Frequency[].class);
      Frequency[] response = responseEntity.getBody();
      ServiceResponseContext serviceResponseContext = new ServiceResponseContext();
      serviceResponseContext.setBody(response);
      serviceResponseContext.setHeaders(responseEntity.getHeaders());
      serviceData.setServiceResponseContext(serviceResponseContext);
      LOG.info((env.getProperty("abstract-demo001-core-service.log.message.key.2") + serviceData));
      return serviceData;
    } catch (Exception e) {
      LOG.error(
          (env.getProperty("abstract-demo001-core-service.log.message.key.3") + serviceData), e);
      throw e;
    }
  }

  @Override
  @CircuitBreaker(
      name = "getTransferProfiles",
      fallbackMethod = "processGetTransferProfilesFallback")
  public ServiceData getTransferProfiles(ServiceData serviceData) {
    try {
      LOG.info(env.getProperty("abstract-demo001-core-service.log.message.key.4"));
      serviceData.setName(getServiceName());
      serviceData.setVersion(getServiceVersion());
      ServiceRequestContext serviceRequestContext = serviceData.getServiceRequestContext();
      serviceRequestContext.setUrl(
          UriComponentsBuilder.fromHttpUrl((BASE_URI + "/profiles"))
              .queryParams(serviceRequestContext.getQueryParams())
              .toUriString());
      serviceRequestContext.setMethod(HttpMethod.GET.name());
      ResponseEntity<Profile[]> responseEntity =
          restTemplate.exchange(
              serviceRequestContext.getUrl(),
              HttpMethod.GET,
              new HttpEntity<>(serviceRequestContext.getHttpHeaders()),
              Profile[].class);
      Profile[] response = responseEntity.getBody();
      ServiceResponseContext serviceResponseContext = new ServiceResponseContext();
      serviceResponseContext.setBody(response);
      serviceResponseContext.setHeaders(responseEntity.getHeaders());
      serviceData.setServiceResponseContext(serviceResponseContext);
      LOG.info((env.getProperty("abstract-demo001-core-service.log.message.key.5") + serviceData));
      return serviceData;
    } catch (Exception e) {
      LOG.error(
          (env.getProperty("abstract-demo001-core-service.log.message.key.6") + serviceData), e);
      throw e;
    }
  }
}
