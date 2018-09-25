package com.gameson.videogames.services;

import com.gameson.videogames.entity.Videogame;
import com.gameson.videogames.repository.IVideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideogameDao {

    @Autowired
    IVideogameRepository iVideogameRepository;

    //Retrieves all the videogames from the DB
    public List<Videogame> getAllVideogames(){
        return iVideogameRepository.findAll();
    }

    //Inserts a videogame to the DB
    public boolean insertVideogame(Videogame videogame) {

        if(iVideogameRepository.save(videogame)!=null)
         return true ;

        return false;
    }

    public Videogame putVideogame(Videogame videogame) {
        if(iVideogameRepository.findById(videogame.getIdVideogame()).isPresent())
        return iVideogameRepository.save(videogame);

        return null;
    }
}
