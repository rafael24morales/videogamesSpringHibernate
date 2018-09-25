package com.gameson.videogames.controller;

import com.gameson.videogames.entity.Empresa;
import com.gameson.videogames.services.EmpresaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    EmpresaDao empresaDao;

    @GetMapping("/empresas")
    public List<Empresa> getAllEmpresas(){
        return empresaDao.findAll();
    }

    @PostMapping("/empresas")
    public void postEmpresa(@RequestBody Empresa empresa){
        empresaDao.postEmpresa(empresa);
    }


}
