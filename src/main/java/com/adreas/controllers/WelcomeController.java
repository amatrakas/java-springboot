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
    public String welcome(Model model,@ModelAttribute("user") User user) throws IOException {
        String welcome = "your login was successful";
        User registeredUser = userService.findUserByEmailAndPassword(user.getEmail(),user.getPassword());
        String registrationError = "User should register first";
        if(!(registeredUser==null)){
            model.addAttribute("hello",welcome);

            return "welcome";

        }else {
            model.addAttribute("error",registrationError);

            return "index";
        }

    }
}
