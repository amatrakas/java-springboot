package com.adreas.services;

import com.adreas.dto.User;
import java.util.List;

/**
 *grafw tis methodous pou tha hrhsimopoihsw ti epistrefoun kai tis parametrous tous
 */
public interface UserService {

    public User saveUser(User user);

    public User findUserByEmailAndPassword(String email,String password);

    public List<User> getAllUsers();


}
