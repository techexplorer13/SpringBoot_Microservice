package com.user.user_service.controller;

import com.user.user_service.pojo.Contact;
import com.user.user_service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/{userId}")
    public @ResponseBody User getId(@PathVariable("userId") String id){
       User s= new User("arjit",id);
       List<Contact> l=new ArrayList<>();
       Contact s1=this.restTemplate.getForObject("http://contact-service/contact/getContact", Contact.class);
       l.add(s1);
       s.setContacts(l);
       return s;
    }

}
