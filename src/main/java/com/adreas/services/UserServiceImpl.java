package com.adreas.services;

import com.adreas.dto.User;
import com.adreas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation toy User service
 */
@Service("userService")
public class UserServiceImpl  implements UserService {

    @Autowired
    UserRepository userRepository;

    /**
     * Ayth h methodos swzei ena user kai ton epistrefei me ta stoihia tou kai to unique id xrhsimopoiwntas to user repository pou kanei extend to crudrepository pou ehei thn methodod save
     *h epomenh methodos pairnei san parametrous
     * to password kai to email tou user
     * kai an uparhei sth vash epistregei ton user me ta stoiheia tou
     * ama den uparhei user me ta stoiheia pou sumplhrwsa epistrefei null
     *
     * @param user
     * @return
     */
    public User saveUser(User user) {

        //kalei t repository kai me thn save swzei ton xrhsth kai epistrefei ton xrhsth
        User user1Saved = userRepository.save(user);


        return user1Saved;
    }



    public User findUserByEmailAndPassword(String email,String password){

        User f = userRepository.findByEmailAndPassword(email,password);

        return f;
    }
    public List<User> getAllUsers(){

        List g = (List) userRepository.findAll();

        return g;
    }
}


