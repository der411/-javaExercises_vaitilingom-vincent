package fr.vaitilingom.myApi.controller;

public class UserRequest {
    
    private String name;
    private int age;

    public UserRequest(String name, int age){

        this.name = name;
        this.age = age;

    }

    public String getName() {
        return this.name;
    }


    public int getAge() {
        return this.age;
    }

}
