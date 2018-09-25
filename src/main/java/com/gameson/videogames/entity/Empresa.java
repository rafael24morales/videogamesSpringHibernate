package com.gameson.videogames.entity;

import javax.persistence.*;

@Entity
@Table(name="empresa")
public class Empresa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idEmpresa;

    @Column(name="noombre")
    String nombre;

    public Empresa(int idEmpresa, String nombre) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
    }

    public Empresa() {
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
