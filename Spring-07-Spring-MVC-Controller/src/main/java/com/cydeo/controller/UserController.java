package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user") //end point url
    public String user(){
        return "/user/userinfo.html"; //go to user folder and then go to the html file
    }

}
