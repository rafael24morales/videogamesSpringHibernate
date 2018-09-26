package com.gameson.videogames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebViewController {

    @GetMapping("/resources")
    public String manejaRecurso(){
        //puedo poner toda la logica que quiera
        return "recurso.html";
    }
    /*
    @RequestMapping("/404.html")
    public String render404(){
        return "404";
    }*/
}
