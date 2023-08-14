package com.bento.Spring_CRUD_API.api.controller;

import com.bento.Spring_CRUD_API.api.model.User;
import com.bento.Spring_CRUD_API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    private UserService userService;
@Autowired
    public  UserController(UserService userService){
        this.userService = userService;
    }
@GetMapping("/user")
    public User getUser(@RequestParam Integer id){ // id can be passed in the url to request specific user

    Optional user = userService.getUser(id);
            if(user.isPresent()){
                return (User) user.get();
            }
           return null;
    }
}
