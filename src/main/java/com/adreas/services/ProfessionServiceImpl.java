package com.adreas.services;

import com.adreas.dto.Profession;
import com.adreas.repositories.ProfessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("professionService")
public class ProfessionServiceImpl implements ProfessionService{
    @Autowired
    ProfessionRepository professionRepository;

    public Profession saveProfession(Profession profession){

        Profession saved = professionRepository.save(profession);

        return saved;
    }
    public List showProfession(){

        List getProfessions = (List) professionRepository.findAll();

        return getProfessions;
    }
    public Optional<Profession> findProfession(Integer id){

        Optional<Profession> professionFound = professionRepository.findById(id);

        return professionFound;
    }
    public void deleteProfessionById(Integer id){

        professionRepository.deleteById(id);
    }
}
