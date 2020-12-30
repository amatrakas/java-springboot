package com.adreas.services;

import com.adreas.dto.User;
import java.util.List;


/**
 *grafw tis methodous pou tha hrhsimopoihsw ti epistrefoun kai tis parametrous tous
 */
public interface UserService {
    /**
     *
     * @param user
     * @return
     */
    public User saveUser(User user);

    /**
     *
     * @param email
     * @param password
     * @return
     */
    public User findUserByEmailAndPassword(String email,String password);

    /**
     *
     * @return
     */
    public List<User> getAllUsers();

    /**
     * giamietai o Spanoymhs
     * @param id
     * @return
     */
    public User getUserById(Integer id);


    public void deleteUserById(Integer id);


}
