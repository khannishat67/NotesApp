package com.cognizant.cosmos.datajpa.core.datajpa.service;

import java.util.*;
import com.cognizant.cosmos.datajpa.core.datajpa.model.*;

public interface IDatajpaCoreService {

  List<Frequency> getTransferFrequencies();

  List<Profile> getTransferProfiles();

  void createTransferProfile(Profile body);

  List<TransferType> getTransferTypes();
}
