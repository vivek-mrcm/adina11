package com.adina.adina.service;

import com.adina.adina.entities.User;

import java.util.List;

public interface UserService
{
    public List<User> getUsers();
    public void createNewUser(User user);
}
