package com.adreas.services;

import com.adreas.dto.Profession;
import com.adreas.repositories.ProfessionRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProfessionServiceImpl implements ProfessionService {
    @Autowired
    ProfessionRepository professionRepository;

    public Profession saveProfession(Profession profession){

       Profession professionSaved =  professionRepository.save(profession);

        return  professionSaved;
    }
}
