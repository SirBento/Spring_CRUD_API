package com.bento.Spring_CRUD_API.service;

import com.bento.Spring_CRUD_API.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private List<User> userList;

    private UserService(){
        userList = new ArrayList<>();
        User user1 = new User(1,"Bento",24,"bernardtowindo38@gmail.com");
        User user2 = new User(2,"GreyCode",25,"GreyCode@gmail.com");
        User user3 = new User(3,"Tatenda",22,"Tatenda@gmail.com");
        User user4 = new User(4,"Tanaka",29,"Tanaka@gmail.com");
        User user5 = new User(5,"Billy",40,"Billy@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }
    public Optional<User> getUser(Integer id) {
       Optional optional = Optional.empty();
        for (User user:userList) {
            if(id == user.getId()){
                optional = Optional.of(user);

                return optional;
            }
        }
        return optional;
    }
}
