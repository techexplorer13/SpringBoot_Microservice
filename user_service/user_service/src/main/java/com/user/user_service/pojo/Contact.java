package com.user.user_service.pojo;

public class Contact {
    public Contact(){}
    public  Contact(String number){
        this.number=number;
    }

    private String number;

    public String getNumber(){
        return this.number;
    }

}
