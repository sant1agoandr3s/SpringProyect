package com.fullstack.users.repository;

import com.fullstack.users.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> users = new ArrayList<>();

    public UserRepository(){

        users.add(new User("16546879-3","Juan","Lopez"));
        users.add(new User("9985763-6","Maria","Soto"));
    }

    public List<User> getUsers(){
        return users;
    }

}
