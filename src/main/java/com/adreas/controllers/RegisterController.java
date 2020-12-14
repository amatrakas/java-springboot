package com.adreas.controllers;

import com.adreas.dto.User;
import com.adreas.repositories.UserRepository;
import com.adreas.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    UserService userService;
    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        return "register_form";
    }

    @PostMapping("/register")
    public String submitForm(Model model, @ModelAttribute("user") User user) throws Exception {

        System.out.println(user);

        userService.saveUser(user);

      userService.fUser(user.getEmail(), user.getPassword());

        return "register_success";

    }
}
