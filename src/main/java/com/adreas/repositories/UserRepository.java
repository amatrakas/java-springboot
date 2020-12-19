package com.adreas.repositories;
import com.adreas.dto.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *repo gia ta records tou user kanei extend to crudrepo pou periehei methodous pou xrhsimopoiw findAll,byId ktl pou einai queries sth vash
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
        // comments ti kanei
        public User findByEmailAndPassword(String email, String password);

}
