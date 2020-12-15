package com.adreas.controllers;

import com.adreas.dto.Client;
import com.adreas.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/client")
    public String showForm(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);


        return "client_form";
    }


    @PostMapping("/client")
    public String submitForm(HttpServletRequest request, Model model, @ModelAttribute("client") @Valid Client client, BindingResult bindingResult) throws Exception {
        boolean hasErrors = bindingResult.hasErrors();
        if (hasErrors){
            client.setSave("Exei ERROR");
        }else {
            client.setSave("DEN EXEI ERROR");
            clientService.saveClient(client);
        }

        return "client_form";
    }
}
