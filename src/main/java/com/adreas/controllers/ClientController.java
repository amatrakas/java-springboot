package com.adreas.controllers;

import com.adreas.dto.Client;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller

public class ClientController {


    @GetMapping("/client")
    public String showForm(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);

        return "client_form";
    }
    String goodWork = "H forma sumplhrwthike epituhws";
    String failed = "apotuhia";

    @PostMapping("/client")
    public String submitForm(HttpServletRequest request, Model model, @ModelAttribute("client") @Valid Client client, BindingResult bindingResult) throws Exception {
        boolean hasErrors = bindingResult.hasErrors();
        if (hasErrors){
            client.setSave("Exei ERROR");
        }else {
            client.setSave("DEN EXEI ERROR");
        }
       request.setAttribute("postresult",hasErrors);
       model.addAttribute("success",goodWork);

        return "client_form";
    }
}
