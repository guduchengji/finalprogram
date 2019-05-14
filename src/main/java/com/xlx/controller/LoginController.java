package com.xlx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("login")
public class LoginController {
    @RequestMapping("login")
    @ResponseBody
    public String login(String username,String password){
        System.out.println(username);
        System.out.println(password);

        return "11111111";
    }
}
