package com.leprecon.userGenerator.controllers;

import com.leprecon.userGenerator.models.User;
import com.leprecon.userGenerator.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home( Model model) {
        Iterable<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "home";
    }

}