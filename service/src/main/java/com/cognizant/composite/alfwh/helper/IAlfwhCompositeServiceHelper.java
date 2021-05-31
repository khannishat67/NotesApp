package com.cognizant.composite.alfwh.helper;

import java.util.List;
import com.cognizant.composite.alfwh.model.*;

public interface IAlfwhCompositeServiceHelper {

  public void processAddPetRequest();

  public void processAddPetResponse();

  public void processUpdatePetRequest();

  public void processUpdatePetResponse();

  public void processFindPetsByStatusRequest();

  public List<Pet> processFindPetsByStatusResponse();

  public void processFindPetsByTagsRequest();

  public List<Pet> processFindPetsByTagsResponse();

  public void processGetPetByIdRequest();

  public Pet processGetPetByIdResponse();

  public void processUpdatePetWithFormRequest();

  public void processUpdatePetWithFormResponse();

  public void processDeletePetRequest();

  public void processDeletePetResponse();

  public void processUploadFileRequest();

  public ModelApiResponse processUploadFileResponse();

  public void processGetInventoryRequest();

  public Object processGetInventoryResponse();

  public void processPlaceOrderRequest();

  public Order processPlaceOrderResponse();

  public void processGetOrderByIdRequest();

  public Order processGetOrderByIdResponse();

  public void processDeleteOrderRequest();

  public void processDeleteOrderResponse();

  public void processCreateUserRequest();

  public void processCreateUserResponse();

  public void processCreateUsersWithArrayInputRequest();

  public void processCreateUsersWithArrayInputResponse();

  public void processCreateUsersWithListInputRequest();

  public void processCreateUsersWithListInputResponse();

  public void processLoginUserRequest();

  public String processLoginUserResponse();

  public void processLogoutUserRequest();

  public void processLogoutUserResponse();

  public void processGetUserByNameRequest();

  public User processGetUserByNameResponse();

  public void processUpdateUserRequest();

  public void processUpdateUserResponse();

  public void processDeleteUserRequest();

  public void processDeleteUserResponse();
}
