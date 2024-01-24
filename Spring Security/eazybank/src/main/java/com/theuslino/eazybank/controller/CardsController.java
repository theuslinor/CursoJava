package com.theuslino.eazybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/myCars")
    public String getCardDetails(){
        return "Here are the card details from the DB";
    }
}
