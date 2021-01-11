package com.adreas.controllers;

import com.adreas.dto.User;
import com.adreas.services.ProfessionService;
import com.adreas.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    ProfessionService professionService;


    /**kanei ena http get request sto /register
     *
     * @param model pernaw san parametro model opou dhlwnei oti prokeite na hrhsimopoihsw ena h parapanw model attribute
     * @return epistrefei mia jsp pou einai h forma gia na sumplhrwsw ta stoiheia tou user
     */
    @GetMapping("/register")
    public String showForm(Model model) {
        //dhmiourgw ena neo keno user
        User user = new User();
       // dhmiourgw ena model pou einai upeuthuno gia thn epoikinwnia client kai server
        model.addAttribute("user", user);
        //epistrefei thn jsp page pou ehw dhmiourghsei pou einai h forma mou gia thn eggrafh tou user
        List professionList = professionService.showProfession();
        model.addAttribute("professionList", professionList);



        return "register_form";
    }

    /**
     * me th methodo auth mporw na kanw edit ena user
     * @param model model san parametro giati tha hrhsimopoihsw ena h parapanw model attributes
     * @param fooId parnei san timh to id pou ehw dwsei sto url analoga me poion user tha epilejw
     *              thn timh auth thn pernaw sth getUserById vriskei ton userr me to id tou edwsa
     * @return epistreferei forma pou ehw
     */
    @GetMapping("/edit")
    public  String editUser(Model model, @RequestParam("userid") Integer fooId) {
        //vriskei ton user apo to id
        User getTheUser = userService.getUserById(fooId);
        //pernraw ton user pou vrika sto model me name user
        model.addAttribute("user", getTheUser);
        /*epeidh sth jsp mou ehw to model attribute me name user s auto t ehw perasei ton user pou vrika apo to id sth forma pou tha
        mouepustrepsei ta pedia tha einai populated me ta stoiheia tou sugekrimenou user */


        List professionList = professionService.showProfession();
        model.addAttribute("professionList", professionList);

        return "register_form";
    }

    /**
     * h methodos apothokeuei ena user kai analoga ama ton kanw edit h ftiahnw ena kainourgio grafei to analogo mhnuma
     * to an ton kanw edit h an ton dhmiourgw ehei na kanei me to id o neos user den ehei enw autos pou kanw edit ehei
     *
     * @param model tha hrishmopoihsw ena h parapanw mode attribute
     * @param user pernaw san parametro ta ena user ta stoiheia pou grafw sth forma dld
     * @return epistrefei th forma mou
     * @throws Exception
     */

    @PostMapping("/register")
    public String submitForm(Model model, @ModelAttribute("user") @Valid User user, BindingResult bindingResult) throws Exception {

        boolean isNotValid = bindingResult.hasErrors();

        String newUser = "User created";
        String updatedUser = "User updated";
         if(user.getId()==0){
            model.addAttribute("created",newUser);
        }else {
            model.addAttribute("updated",updatedUser);
        }


        if(isNotValid){
            return "register_form";
        }else{
            userService.saveUser(user);
        }



        List usersList = userService.getAllUsers();

        model.addAttribute("list",usersList);


        return "users_list";

    }
    @GetMapping("/delete")
    public String deleteMyUser(Model model,@RequestParam("userid") Integer id){

        userService.deleteUserById(id);

        List usersList = userService.getAllUsers();

        model.addAttribute("list",usersList);


        return "users_list";
    }


}
