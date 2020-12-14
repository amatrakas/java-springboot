package com.adreas.controllers;

import com.adreas.services.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.adreas.dto.Profession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class ProfessionController {
    @Autowired
    ProfessionService professionService;

    @GetMapping("/profession")
    public String showProfession(Model model){

        Profession profession = new Profession();

        model.addAttribute("profession",profession);

        return "profession_form";
    }

    @PostMapping("/profession")
    public String submitProfession(@ModelAttribute("profession") Profession profession){

    professionService.saveProfession(profession);

    return "saved_profession";
    }






}
