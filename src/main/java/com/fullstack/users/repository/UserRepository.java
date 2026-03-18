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

    public User getUser(String rut){
        for(User user: users){
            if(user.getRut().equals(rut)){
                return user;
            }
        }
        return null;
    }
    public User saveUser(User user){
        users.add(user);
        return user;
    }

    public User updateUser(User user){
        int i;

        for(i=0;1<users.size();i++){
            if(users.get(i).getRut().equals(user.getRut())){
                users.set(i, user);
                return user;
            }
        }
        return null;
    }

    public void deleteUser(String rut){
        for(User user: users){
            if(user.getRut().equals(rut)){
                users.remove(user);
            }
    }
}
}
