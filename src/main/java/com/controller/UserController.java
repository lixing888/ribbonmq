package com.controller;

import com.auth.Auth;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Auth
    @RequestMapping("test")
    public void test(){
        System.out.println("访问了我");
    }
}
