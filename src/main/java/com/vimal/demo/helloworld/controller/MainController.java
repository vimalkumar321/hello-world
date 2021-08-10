package com.vimal.demo.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        System.out.println("Hello World");
        return "<html><body><h1>Hello</h1></body></html>";
    }

}
