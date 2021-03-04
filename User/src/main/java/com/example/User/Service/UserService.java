package com.example.User.Service;

import com.example.User.Model.User;
import com.example.User.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    IUserRepository userRepository;

    public Iterable<User> getAll(){
        return userRepository.findAll();
    }
}
