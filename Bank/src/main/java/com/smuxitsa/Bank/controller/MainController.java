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

    @GetMapping("/transfer")
    public String transferPoints(){

        return "transfer";
    }

    @GetMapping("/enquireTransaction")
    public String checkstatus(){

        return "enquireTransaction";
    }

    @GetMapping("/login")
    public String login(){

        return "login";
    }

}
