package com.adreas.controllers;
import com.adreas.dto.User;
import com.adreas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class WelcomeController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String home(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "index";
      //to model
    }


    @PostMapping("/")
    public String welcome(@ModelAttribute("user") User user) throws IOException {
        System.out.println(user);

        User registeredUser = userService.fUser(user.getEmail(),user.getPassword());



        return "welcome";
    }
}
