package com.user.user_service.pojo;

import java.util.List;

public class User {

    private  String username;
    private  String id;
    private List<Contact> contacts;

    public User(String name,String id){
        this.username=name;
        this.id=id;
    }

    public String getUsername(){
        return username;
    }

    public String getId(){
        return id;
    }

    public List<Contact> getContacts(){
        return this.contacts;
    }

    public void setContacts(List<Contact> c){
        this.contacts=c;
    }
}
