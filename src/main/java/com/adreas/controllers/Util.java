package com.adreas.controllers;

import com.adreas.dto.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {

    private Object FileNotFoundException;

    public <user> void saveEachUser(String filename, User user) throws Exception {
        PrintWriter pw = null;
//printwriter bufferedwriter pws douleuoun
        String userString = "name:" + user.getName() + ", " + "surname:" + user.getSurname() + ", " + "phone:" + user.getPhone() + ", " + "email:" + user.getEmail() + ", " + "password:" + user.getPassword();
        pw = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)));
        pw.println(userString + "\n");
        pw.close();
        //new branch


    }

    public boolean ifUserExists(String filePath, User user) throws FileNotFoundException {

        File myFile = new File(filePath);
        Scanner myReader = new Scanner(myFile);
        StringBuffer data1 = new StringBuffer();

        while (myReader.hasNextLine()) {
            data1.append(myReader.nextLine());
        }
           if ( data1.indexOf(user.getName()) > -1){
               return true;
           }
            return false;
    }
}
