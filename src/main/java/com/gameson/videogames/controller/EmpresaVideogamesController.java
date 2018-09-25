package com.gameson.videogames.controller;

import com.gameson.videogames.entity.Empresa;
import com.gameson.videogames.entity.Videogame;
import com.gameson.videogames.services.EmpresaVideogameDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaVideogamesController {

    @Autowired
    EmpresaVideogameDao empresaVideogameDao;

    @GetMapping("/{id_emp}/videogames")
    public List<Videogame> getAllVideogamesByEmpresa(
            @PathVariable int id_emp){
        return empresaVideogameDao.findAll(id_emp);
    }

    @PostMapping("/{id_emp}/videogames")
    public void saveVideogameWithEmpresa(
            @RequestBody Videogame videogame,
            @PathVariable int id_emp
    ){
        videogame.setEmpresa(new Empresa(id_emp,""));
        empresaVideogameDao.saveVideogameWithEmpresa(videogame);
    }

}
