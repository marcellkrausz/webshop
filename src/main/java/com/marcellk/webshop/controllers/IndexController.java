package com.marcellk.webshop.controllers;

import com.marcellk.webshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    private final UserService userService;

    @Autowired
    public IndexController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping({"/","","/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "index";
    }
}
