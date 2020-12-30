package com.adreas.services;

import com.adreas.dto.Profession;

import java.util.List;
import java.util.Optional;

public interface ProfessionService {

    public Profession saveProfession(Profession profession);

    public List<Profession> showProfession();

    public Optional<Profession> findProfession(Integer id);

    public void deleteProfessionById(Integer id);
}
