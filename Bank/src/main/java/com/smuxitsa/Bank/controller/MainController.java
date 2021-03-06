package com.smuxitsa.Bank.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;


@Controller
public class MainController {
    HttpSession session;
    @GetMapping("/programs")
    public String programs(){
       return "programs";
    }

    @GetMapping("/validateMembership")
    public String validateMembership(){

        return "validateMembership";
    }

}
