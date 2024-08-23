package com.adina.adina.service;

import com.adina.adina.entities.User;
import com.adina.adina.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getUsers()
    {
        //List<User> ugr=userRepository.findAll();
        return userRepository.findAll();
    }

    @Override
    public void createNewUser(User user) {

        userRepository.save(user);
    }

}
