package com.theuslino.eazybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping(" ")
    public String saveContactInquiryDetails(){
        return "Inquiry details are saved to the DB";
    }
}
