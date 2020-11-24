package com.adreas.dto;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Client {
    @NotNull
    @Size(min=4,max=7)
    private String firstname;
    @NotNull
    private String lastname;
    private String gender;
    private String[] vehicles;
    private String cars;
    private String address;
    private String save;
    @NotNull
    @Min(20)
    private  String age;



    public String getAge() {
        return age;
    }

    public String getSave() {
        return save;
    }

    public String setSave(String save) {
        this.save = save;
        return save;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(String[] vehicles) {
        this.vehicles = vehicles;
    }

    public String getCars() {
        return cars;
    }

    public void setCars(String cars) {
        this.cars = cars;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}





