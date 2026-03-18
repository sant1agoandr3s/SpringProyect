package com.fullstack.users.service;

import com.fullstack.users.models.User;

import java.util.List;

public interface UserService {

  public List<User> listUsers();
  public User getUser(String rut);
  public User saveUser(User user);
  public User updateUser(User user);
  public void deleteUser(String User);

}
