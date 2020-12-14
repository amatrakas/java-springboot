package com.adreas.controllers;

import com.adreas.dto.User;
import com.adreas.repositories.UserRepository;
import com.adreas.services.UserService;

import com.sun.deploy.security.SelectableSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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
        User findUser = userService.findUserByEmailAndPassword(user.getEmail(),user.getPassword());

        if((findUser==null)) {
            userService.saveUser(user);
        }else{
            System.out.println("user already exists");
        }



        return "register_success";

    }
    @GetMapping("/showusers")
    public String showDbUsers(Model model){

        User user = new User();
        List usersList = userService.getAllUsers();
        model.addAttribute("user",user);

        model.addAttribute("list",usersList);

        return "all_users";
    }
}
