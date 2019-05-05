package com.itcast.learnspringboot.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
    @RequestMapping("/druid")
    public String sayHello(String password,String email){
        System.out.println(password);
        System.out.println(email);
        return "success";
    }
}
