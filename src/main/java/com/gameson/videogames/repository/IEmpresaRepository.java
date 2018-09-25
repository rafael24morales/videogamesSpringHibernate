package com.gameson.videogames.repository;

import com.gameson.videogames.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpresaRepository extends JpaRepository<Empresa, Integer> {
}
