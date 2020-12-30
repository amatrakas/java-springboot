package com.adreas.services;

import com.adreas.dto.User;
import com.adreas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implementation toy User service
 */
@Service("userService")
public class UserServiceImpl  implements UserService {

    @Autowired
    UserRepository userRepository;

    /**
     * auth h methodos swzei ena hrhsth sth vash
     * @param user san parametro ena user me ta stoiheia pou sumlhrwnw sth forma
     * @return epistrefei ton swmeno xrhsth me ta stoiheia tou
     */
    public User saveUser(User user) {

        //kalei t repository kai me thn save() swzei ton xrhsth kai epistrefei ton xrhsth
        User  user1Saved = userRepository.save(user);

        //epistrefei ton xrhsth poou swthike sth vash
        return user1Saved;
    }

    /**
     * h methodos vriskei ton user sth vash
     * @param email oi parametroi pou pernaw einai gia na vrw ton hthsth vash to email kai to pw pou dinw
     * @param password
     * @return epistrefei ton hrhsth an uparhei apo th vash me ta stoiheia tou
     */

    public User findUserByEmailAndPassword(String email,String password){
        /*kalei to repository opou ehw thn findByEmailAndPassword() den uparhei sto crudrepository h java to katalavainei apo to onoma
        pernaw to email kai to pw
         */
        User f = userRepository.findByEmailAndPassword(email,password);
        //an uparhei o user ton epistrefei me ta stoiheia tou alliws null
        return f;
    }

    /**
     * h methodos vriskei olous tous users pou ehw sth vash
     *
     * @return epistrefei mia lista me tous users ths vashs
     */
    public List<User> getAllUsers(){
    //kalei to repository kai me thn findall() ftiahnei mia lista me tous users ths vashs
        List g = (List) userRepository.findAll();
        //epistrefei thn lista me tous users ths vashs
        return g;
    }

    /**
     * h methodos vriskei tous users me to sumfwna me to id tous
     * @param id san parametro pernaw to id pou hreiaetai gia na vrei ton user
     * @return epistrefei ton user
     */
    public User getUserById(Integer id){
        //kalei to repo kai me thn findById() pou ehei to crud repo vriskei to user me to id pou perasa
        Optional<User>  optionalUser = userRepository.findById(id);
        //epistrefei ton user
        return optionalUser.get();
    }
    public void deleteUserById(Integer id){

        userRepository.deleteById(id);

    }
}


