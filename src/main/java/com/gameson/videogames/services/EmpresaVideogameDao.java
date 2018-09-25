package com.gameson.videogames.services;

import com.gameson.videogames.entity.Videogame;
import com.gameson.videogames.repository.IVideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaVideogameDao {

    @Autowired
    IVideogameRepository iVideogameRepository;


    public List<Videogame> findAll(int id_emp) {
        return iVideogameRepository.findByEmpresa_IdEmpresa(id_emp);
    }

    public void saveVideogameWithEmpresa(Videogame videogame) {
        iVideogameRepository.save(videogame);
    }
}
