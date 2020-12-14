package com.adreas.controllers;

import com.adreas.services.ServiceCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ShowCacheController {

    @Autowired
    ServiceCache serviceCache;
    @GetMapping("/showcache")
    public String showMessage(Model model) {


        String hello = serviceCache.message();

        model.addAttribute("message",hello);
        List<String> list1 = Arrays.asList(new String[]{"foo", "bar", "foo1", "bar1", "foo2", "bar2", "foo3", "bar3", "foo4", "bar4", "foo22", "bar22", "foo33", "bar33", "foo44", "bar44", "foo"});
        List<String> list2 = Arrays.asList(new String[]{"fooo", "barr", "foo11", "bar11", "foo22", "bar22", "foo33", "bar33", "foo44", "bar44", "foo", "bar", "foo1", "bar1", "foo2", "bar2", "foo3", "bar3", "foo4", "bar4"});

       List l = serviceCache.listWithoutCommons(list1,list2);
        System.out.println(l);


        return "show_message";

    }

}
