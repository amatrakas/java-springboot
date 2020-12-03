package com.adreas.controllers;

import com.adreas.dto.ServiceCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowCacheController {

    @Autowired
    ServiceCache serviceCache;
    @GetMapping("/showcache")
    public String showMessage(Model model) {


        String hello = serviceCache.message();

        model.addAttribute("message",hello);

        return "show_message";

    }

}
