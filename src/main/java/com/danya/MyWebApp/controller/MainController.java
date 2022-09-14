package com.danya.MyWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api")
public class MainController {

    @GetMapping("test")
    public String showHomePage(){
        return "index";
    }
}
