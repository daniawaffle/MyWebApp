package com.danya.MyWebApp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired private UserService service;

    @GetMapping("/users")
    public String showUsersList(Model model){
        List<User> ListUsers= service.listAll();
        model.addAttribute("ListUsers",ListUsers);
        return "users";
    }

}
