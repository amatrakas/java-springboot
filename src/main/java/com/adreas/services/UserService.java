package com.adreas.services;

import com.adreas.dto.User;
import com.adreas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *grafw tis methodous pou tha hrhsimopoihsw ti epistrefoun kai tis parametrous tous
 */
public interface UserService {

    public User saveUser(User user);

    public User findUserByEmailAndPassword(String email,String password);

    public List<User> getAllUsers();


}
