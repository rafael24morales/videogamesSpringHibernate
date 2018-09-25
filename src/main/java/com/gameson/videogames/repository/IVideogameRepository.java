package com.gameson.videogames.repository;

import com.gameson.videogames.entity.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVideogameRepository extends JpaRepository<Videogame, Integer> {

    List<Videogame> findByEmpresa_IdEmpresa(Integer empresaId);
}
