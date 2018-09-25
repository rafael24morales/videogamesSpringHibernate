package com.gameson.videogames.controller;


import com.gameson.videogames.entity.Videogame;
import com.gameson.videogames.services.VideogameDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideojuegosController {

    @Autowired
    VideogameDao videogameDao;

    @GetMapping("/videogames")
    public List<Videogame> getAllVideogames(){
        return videogameDao.getAllVideogames();
    }

    @PostMapping("/videogames")
    public boolean setVideogame(@RequestBody Videogame videogame ){
       return videogameDao.insertVideogame(videogame);
    }

    @PutMapping("/videogames/{id}")
    public Videogame putVideogame(@RequestBody Videogame videogame,
                                  @PathVariable int id){
        videogame.setIdVideogame(id);
        return videogameDao.putVideogame(videogame);
    }

}
