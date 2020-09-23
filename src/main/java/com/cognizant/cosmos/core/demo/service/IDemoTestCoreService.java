package com.cognizant.cosmos.core.demo.service;

import java.util.*;
import com.cognizant.cosmos.core.utils.execution.ServiceRequestContext;
import com.cognizant.cosmos.core.demo.model.*;

public interface IDemoTestCoreService {

  List<Frequency> getTransferFrequencies(ServiceRequestContext context);

  List<Profile> getTransferProfiles(ServiceRequestContext context);

  void createTransferProfile(ServiceRequestContext context);

  List<TransferType> getTransferTypes(ServiceRequestContext context);
}
