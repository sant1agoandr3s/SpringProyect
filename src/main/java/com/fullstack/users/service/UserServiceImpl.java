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
}
