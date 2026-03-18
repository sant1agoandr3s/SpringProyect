package com.fullstack.users.service;

import com.fullstack.users.models.User;
import com.fullstack.users.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository= new UserRepository();

    @Override
    public List<User> listUsers() {
        return userRepository.getUsers();
    }

    @Override
    public User getUser(String rut) {
        return userRepository.getUser(rut);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.saveUser(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public void deleteUser(String rut) {
        userRepository.deleteUser(rut);
    }

}
