package com.adreas.repositories;
import com.adreas.dto.Profession;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionRepository extends CrudRepository<Profession,Integer>{
}
