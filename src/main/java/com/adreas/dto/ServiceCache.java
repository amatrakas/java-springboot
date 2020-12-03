package com.adreas.dto;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.expression.spel.CodeFlow;
import org.springframework.stereotype.Component;
import org.springframework.cache.CacheManager;
;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class ServiceCache {

    @Autowired
    CacheManager cacheManager;

    public String message(){


        Cache cache = cacheManager.getCache("usercache");





        // List<?> objects = (List<?>) ((ConcurrentMapCache) cache).getNativeCache();


        // Metatroph Integer se string
        // Metatroph String se integer
        // Metatroph Long se string
        // Metatroph string se Long

        Integer phone = 45;
        String convert = String.valueOf(phone);
        System.out.println(convert);
        String  phone1 = "2255885";
        Integer c = Integer.parseInt(phone1);
        System.out.println(c);
        Long  sb =578397983L;
        String d = String.valueOf(sb);
        String f = "348090";
        Long g = Long.parseLong(f);
        System.out.println(g);
        User user = new User();
        Client client = new Client();
        user.setPhone(Integer.parseInt(f));
        user.setEmail(String.valueOf(phone));
        user.setJsb(Long.valueOf(phone1));
        user.setId(String.valueOf(sb));
        client.setAge("555");

        String greeting = "geia sou cache";

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
