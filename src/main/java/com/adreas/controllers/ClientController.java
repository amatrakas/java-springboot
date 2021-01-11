package com.adreas.controllers;

import com.adreas.dto.Client;
import com.adreas.services.ClientService;
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
public class ClientController {

    @Autowired
    ClientService clientService;

    @Autowired
    ProfessionService professionService;

    @GetMapping("/client")
    public String showForm(Model model) {
        Client client = new Client();

        List professionList = professionService.showProfession();

        model.addAttribute("professionList", professionList);


        model.addAttribute("client", client );

        return "client_form";
    }

    @GetMapping("/review")
    public String editMyClient(Model model, @RequestParam("clientid") Integer id){

        Optional<Client> getTheClient = clientService.findById(id);

        List professionList = professionService.showProfession();
        model.addAttribute("professionList", professionList);

        model.addAttribute("client",getTheClient);

        professionService.findProfession(id);

        return "client_form";


    }


    @PostMapping("/client")
    public String submitForm(Model model, @ModelAttribute("client") @Valid Client client, BindingResult bindingResult) throws Exception {

        boolean hasErrors = bindingResult.hasErrors();

        String updateClient = "client updated";
        String createClient = "client created";
        if(client.getId()==0){
            model.addAttribute("created",createClient);
        }else{
            model.addAttribute("updated",updateClient);
        }
        if (hasErrors){
            return "client_form";
        }else {
            clientService.saveClient(client);
        }

        List clientList = clientService.findClients();

        model.addAttribute("listc",clientList);

        return "clients_list";
    }
    @GetMapping("/remove")
    public String removeClient(Model model,@RequestParam("clientid") Integer id){

        clientService.deleteClientById(id);

        List clientList = clientService.findClients();

        model.addAttribute("listc",clientList);

        return "clients_list";
    }
}
