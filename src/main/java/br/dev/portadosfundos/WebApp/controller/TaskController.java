package br.dev.portadosfundos.WebApp.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TaskController {

    @GetMapping("/create")

    public String getCrieString(){
        return "create";
    }
    
}
