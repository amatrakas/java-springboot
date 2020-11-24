package com.adreas.controllers;
import com.adreas.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String home(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "index";
      //to model
    }


    @PostMapping("/")
    public String welcome(@ModelAttribute("user") User user) throws IOException {
//oi parametroi sth methodo
        System.out.println(user);


        return "welcome";
    }
}
