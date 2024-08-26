package com.adina.adina.service;

import com.adina.adina.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService
{
    public List<User> getUsers();
    public void createNewUser(User user);


    User getUser(Integer id);


    void updateUser(Integer id, User user);
}
