package com.gameson.videogames.controller;


import com.gameson.videogames.entity.Videogame;
import com.gameson.videogames.services.VideogameDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideojuegosControl {

    @Autowired
    VideogameDao videogameDao;

    @GetMapping("/videogames")
    public List<Videogame> getAllVideogames(){
        return videogameDao.getAllVideogames();
    }

}
