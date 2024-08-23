package com.adina.adina.controller;

import com.adina.adina.entities.User;
import com.adina.adina.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping("/userList")
    public List<User> getUserList()
    {
        List<User> user=userService.getUsers();
        return user;

    }
    @PostMapping("/register")
    public String registerUser(@RequestBody User user)
    {
         userService.createNewUser(user);
         return "User Register........................";


    }

}
