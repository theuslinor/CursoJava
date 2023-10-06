package br.com.compass.exerciciosspringboot.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class PrimeiroController {

    @GetMapping(path = {"/ola", "/saudacao"})
    public String ola(){
        return "Olá Spring Boot!";
    }

}