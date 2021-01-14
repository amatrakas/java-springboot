package com.adreas.controllers;

import com.adreas.dto.Profession;
import com.adreas.services.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class ProfessionController {

    @Autowired
    ProfessionService professionService;

    @GetMapping("/profession")
    public  String showMyForm(Model model){

        Profession profession = new Profession();

        model.addAttribute("profession",profession);

        return "profession_form";
    }

    @GetMapping("/view")
    public  String viewProfession(Model model, @RequestParam("professionid") Integer id){

        Optional<Profession> professionById = professionService.findProfession(id);

        model.addAttribute("profession",professionById);

        return "profession_form";


    }

    @PostMapping("/profession")
    public String submitMyForm(Model model, @ModelAttribute("profession") @Valid Profession profession, BindingResult bindingResult){
        boolean notValid = bindingResult.hasErrors();
        String created = "Profession created";
        String updated = "Profession updated";
        if(profession.getId()==0){
            model.addAttribute("created",created);
        }else{
            model.addAttribute("updated",updated);
        }
        if(notValid){
            return "profession_form";
        }

        List professionList = professionService.showProfession();

        model.addAttribute("listp",professionList);

        return "profession_list";
    }
    @GetMapping("/professionlist")
    public String showMyUsers(Model model){

        List professionList = professionService.showProfession();

        model.addAttribute("listp",professionList);

        return "profession_list";


    }
    @GetMapping("/erase")
    public String deleteMyProfession(Model model,@RequestParam("professionid") Integer id){

        professionService.deleteProfessionById(id);

        List professionList = professionService.showProfession();

        model.addAttribute("listp",professionList);

        return "profession_list";
    }
}
