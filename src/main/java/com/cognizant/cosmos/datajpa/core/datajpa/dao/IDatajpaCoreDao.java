package com.cognizant.cosmos.datajpa.core.datajpa.dao;

import java.util.*;
import com.cognizant.cosmos.datajpa.core.datajpa.model.*;

public interface IDatajpaCoreDao {

  List<Frequency> getTransferFrequencies();

  List<Profile> getTransferProfiles();

  void createTransferProfile(Profile body);

  List<TransferType> getTransferTypes();
}
