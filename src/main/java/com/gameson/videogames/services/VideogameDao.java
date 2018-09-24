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

    public List<Videogame> getAllVideogames(){
        return iVideogameRepository.findAll();
    }

}
