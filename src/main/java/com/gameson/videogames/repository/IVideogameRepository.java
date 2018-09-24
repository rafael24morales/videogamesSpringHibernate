package com.gameson.videogames.repository;

import com.gameson.videogames.entity.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVideogameRepository extends JpaRepository<Videogame, Integer> {

}
