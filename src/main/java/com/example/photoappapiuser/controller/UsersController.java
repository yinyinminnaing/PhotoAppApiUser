package com.example.photoappapiuser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {

    @RequestMapping("/check/status")
    public String checkUserStaus(){
        return "Working";
    }
}
