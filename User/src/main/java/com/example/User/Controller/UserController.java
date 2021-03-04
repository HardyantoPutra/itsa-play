package com.example.User.Controller;


import com.example.User.Model.User;
import com.example.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/users")
    Iterable<User> all() {
       return userService.getAll();
    }
}
