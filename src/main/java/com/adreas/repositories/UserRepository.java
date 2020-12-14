package com.adreas.repositories;
import com.adreas.dto.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

        public User findByEmailAndPassword(String email, String password);

}