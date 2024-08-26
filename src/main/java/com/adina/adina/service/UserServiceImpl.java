package com.adina.adina.service;

import com.adina.adina.entities.User;
import com.adina.adina.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

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

    @Override
    public User getUser(Integer id) {
        User user=userRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid Id"+id));
        return user;
    }

    @Override
    public void updateUser(Integer id, User user)
    {
        //check whether user in database or not
        userRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid User Id"+id));

    }


}
