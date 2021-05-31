package com.cognizant.composite.alfwh.delegator;

import com.cognizant.composite.alfwh.IAlfwhCompositeService;
import com.cognizant.composite.alfwh.helper.IAlfwhCompositeServiceHelper;
import com.cognizant.composite.alfwh.model.ModelApiResponse;
import com.cognizant.composite.alfwh.model.Object;
import com.cognizant.composite.alfwh.model.Order;
import com.cognizant.composite.alfwh.model.Pet;
import com.cognizant.composite.alfwh.model.User;
import com.cognizant.cosmos.core.utils.execution.ServiceExecutionContextUtil;
import com.cognizant.cosmos.core.utils.future.FutureUtils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AlfwhCompositeServiceDelegator
    implements IAlfwhCompositeService, ServiceExecutionContextUtil {
  private final FutureUtils futureUtils;

  private final IAlfwhCompositeServiceHelper alfwhCompositeServiceHelper;

  @Override
  public void addPet(Pet body) {
    alfwhCompositeServiceHelper.processAddPetRequest();
    alfwhCompositeServiceHelper.processAddPetResponse();
  }

  @Override
  public void updatePet(Pet body) {
    alfwhCompositeServiceHelper.processUpdatePetRequest();
    alfwhCompositeServiceHelper.processUpdatePetResponse();
  }

  @Override
  public List<Pet> findPetsByStatus() {
    alfwhCompositeServiceHelper.processFindPetsByStatusRequest();
    return alfwhCompositeServiceHelper.processFindPetsByStatusResponse();
  }

  @Override
  public List<Pet> findPetsByTags() {
    alfwhCompositeServiceHelper.processFindPetsByTagsRequest();
    return alfwhCompositeServiceHelper.processFindPetsByTagsResponse();
  }

  @Override
  public Pet getPetById(long petId) {
    alfwhCompositeServiceHelper.processGetPetByIdRequest();
    return alfwhCompositeServiceHelper.processGetPetByIdResponse();
  }

  @Override
  public void updatePetWithForm(long petId) {
    alfwhCompositeServiceHelper.processUpdatePetWithFormRequest();
    alfwhCompositeServiceHelper.processUpdatePetWithFormResponse();
  }

  @Override
  public void deletePet(long petId) {
    alfwhCompositeServiceHelper.processDeletePetRequest();
    alfwhCompositeServiceHelper.processDeletePetResponse();
  }

  @Override
  public ModelApiResponse uploadFile(long petId) {
    alfwhCompositeServiceHelper.processUploadFileRequest();
    return alfwhCompositeServiceHelper.processUploadFileResponse();
  }

  @Override
  public Object getInventory() {
    alfwhCompositeServiceHelper.processGetInventoryRequest();
    return alfwhCompositeServiceHelper.processGetInventoryResponse();
  }

  @Override
  public Order placeOrder(Order body) {
    alfwhCompositeServiceHelper.processPlaceOrderRequest();
    return alfwhCompositeServiceHelper.processPlaceOrderResponse();
  }

  @Override
  public Order getOrderById(long orderId) {
    alfwhCompositeServiceHelper.processGetOrderByIdRequest();
    return alfwhCompositeServiceHelper.processGetOrderByIdResponse();
  }

  @Override
  public void deleteOrder(long orderId) {
    alfwhCompositeServiceHelper.processDeleteOrderRequest();
    alfwhCompositeServiceHelper.processDeleteOrderResponse();
  }

  @Override
  public void createUser(User body) {
    alfwhCompositeServiceHelper.processCreateUserRequest();
    alfwhCompositeServiceHelper.processCreateUserResponse();
  }

  @Override
  public void createUsersWithArrayInput(List<User> body) {
    alfwhCompositeServiceHelper.processCreateUsersWithArrayInputRequest();
    alfwhCompositeServiceHelper.processCreateUsersWithArrayInputResponse();
  }

  @Override
  public void createUsersWithListInput(List<User> body) {
    alfwhCompositeServiceHelper.processCreateUsersWithListInputRequest();
    alfwhCompositeServiceHelper.processCreateUsersWithListInputResponse();
  }

  @Override
  public String loginUser() {
    alfwhCompositeServiceHelper.processLoginUserRequest();
    return alfwhCompositeServiceHelper.processLoginUserResponse();
  }

  @Override
  public void logoutUser() {
    alfwhCompositeServiceHelper.processLogoutUserRequest();
    alfwhCompositeServiceHelper.processLogoutUserResponse();
  }

  @Override
  public User getUserByName(String username) {
    alfwhCompositeServiceHelper.processGetUserByNameRequest();
    return alfwhCompositeServiceHelper.processGetUserByNameResponse();
  }

  @Override
  public void updateUser(String username, User body) {
    alfwhCompositeServiceHelper.processUpdateUserRequest();
    alfwhCompositeServiceHelper.processUpdateUserResponse();
  }

  @Override
  public void deleteUser(String username) {
    alfwhCompositeServiceHelper.processDeleteUserRequest();
    alfwhCompositeServiceHelper.processDeleteUserResponse();
  }
}
