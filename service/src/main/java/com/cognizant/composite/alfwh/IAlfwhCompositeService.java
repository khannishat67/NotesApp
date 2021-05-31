package com.cognizant.composite.alfwh;

import java.util.List;
import com.cognizant.composite.alfwh.model.*;

/** */
public interface IAlfwhCompositeService {

  void addPet(Pet body);

  void updatePet(Pet body);

  public List<Pet> findPetsByStatus();

  public List<Pet> findPetsByTags();

  public Pet getPetById(long petId);

  void updatePetWithForm(long petId);

  void deletePet(long petId);

  public ModelApiResponse uploadFile(long petId);

  public Object getInventory();

  public Order placeOrder(Order body);

  public Order getOrderById(long orderId);

  void deleteOrder(long orderId);

  void createUser(User body);

  void createUsersWithArrayInput(List<User> body);

  void createUsersWithListInput(List<User> body);

  public String loginUser();

  void logoutUser();

  public User getUserByName(String username);

  void updateUser(String username, User body);

  void deleteUser(String username);
}
