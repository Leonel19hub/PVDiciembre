package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.services.IHabitacionService;

@Controller
public class ApplicationController {

    @Autowired
    IHabitacionService IHabitacionService;
    
    @GetMapping("/inicio")
    public String startApplication(){
        return "index";
    }
}
