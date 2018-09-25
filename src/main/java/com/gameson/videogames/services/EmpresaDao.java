package com.gameson.videogames.services;

import com.gameson.videogames.entity.Empresa;
import com.gameson.videogames.repository.IEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaDao {

    @Autowired
    IEmpresaRepository iEmpresaRepository;


    public List<Empresa> findAll() {
        return iEmpresaRepository.findAll();
    }


    public void postEmpresa(Empresa empresa) {
        iEmpresaRepository.save(empresa);
    }
}
