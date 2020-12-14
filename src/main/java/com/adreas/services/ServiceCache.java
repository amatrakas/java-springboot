package com.adreas.services;

import com.adreas.dto.Client;
import com.adreas.dto.Test;
import com.adreas.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.stereotype.Component;
import org.springframework.cache.CacheManager;
import java.util.*;


@Component
public class ServiceCache {

    @Autowired
    CacheManager cacheManager;

    List<String> list1 = Arrays.asList(new String[]{"foo", "bar", "foo1", "bar1", "foo2", "bar2", "foo3", "bar3", "foo4", "bar4", "foo22", "bar22", "foo33", "bar33", "foo44", "bar44", "foo"});
    List<String> list2 = Arrays.asList(new String[]{"fooo", "barr", "foo11", "bar33", "foo22", "bar22", "foo33", "bar33", "foo44", "bar44", "foo", "bar", "foo1", "bar1", "foo2", "bar2", "foo3", "bar3", "foo4", "bar4"});

    public List<String> listWithoutCommons(List<String> list1, List<String> list2) {
        List<String> unCommon = new ArrayList<>();
        for (String i : list2) {
            System.out.println(i);

            if(!(list1.contains(i))){
                unCommon.add(i);


            }

        }

        for (String i : list1) {
            System.out.println(i);

            if(!(list2.contains(i))){
                unCommon.add(i);

            }

        }
        return unCommon;

        }


















    public String message(){

        Cache cache = cacheManager.getCache("usercache");

        Client client = new Client();
        client.setAge("555");

        String greeting = "geia sou cache";

        User user =new User();
        User user1 = new User();
        Client client1 = new Client();
        Test test = new Test();

        List<Client> clients = new ArrayList<>();
        clients.add(client);
        clients.add(client1);

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);

        client1.setFirstname("antreas");
        client1.setAddress("delagrammatika");

        user1.setName("matrakas");
        user1.setEmail("andrew@");

        test.setClientList(clients);
        test.setUserList(users);


        int counter = 0;
        String h = "";
        String p = "";

        for(Client i : test.getClientList()) {

            counter++;


            if(counter==2){
                h = i.getFirstname();
                p = i.getAddress();

            }

        }
        int x = 0;
        String q = "";
        String o = "";
        for(User i : test.getUserList()){
            x++;

            if(x==2){
                 q = i.getName();
                 o = i.getEmail();
            }
        }

        System.out.println("Client 2 firstname:" + h);
        System.out.println("Client 2 address:" + p);;
        System.out.println("User 2 name:" + q);;
        System.out.println("User 2 email:" + o);;

        return greeting;

    }


}
