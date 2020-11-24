package com.adreas.controllers;

import com.adreas.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.FileNotFoundException;
import java.io.IOException;

@Controller

public class RegisterController {


    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        return "register_form";
    }

    @PostMapping("/register")
    public String submitForm(Model model, @ModelAttribute("user") User user) throws Exception {

        System.out.println(user);

        String writer = "epituxia apothikeushs";

        String file = "C:/Users/antre/" + "adreas.txt";

        Util adreas = new Util();

        boolean isCorrect = adreas.ifUserExists(file,user);

        if(!isCorrect){
            try {

                Util save = new Util();
                save.saveEachUser("C:/Users/antre/" + "adreas.txt",user);
            }catch (Exception e){
                writer = e.getMessage();
            } finally {
                model.addAttribute("errorCase",writer);
            }
        }else {
            System.out.println("User already exists");
        }
        return "register_success";
    }
}