package com.contact.user_contact.controller;

import com.contact.user_contact.pojo.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @GetMapping("/getContact")
    public Contact getContact(){
        return new Contact("234");
    }
}
