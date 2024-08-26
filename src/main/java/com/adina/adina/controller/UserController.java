package com.adina.adina.controller;

import com.adina.adina.entities.User;
import com.adina.adina.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Integer id)
    {
    return userService.getUser(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Integer id,@RequestBody User user)
    {
         userService.updateUser(id,user);
         return ResponseEntity.noContent().build();

    }


}
