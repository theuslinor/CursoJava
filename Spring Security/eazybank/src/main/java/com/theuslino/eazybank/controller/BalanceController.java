package com.theuslino.eazybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/MyBalance")
    public String getBalanceDetails(){
        return "Here are the balance datails from the DB";
    }
}
