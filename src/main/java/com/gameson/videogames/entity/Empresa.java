package com.gameson.videogames.entity;

import javax.persistence.*;

@Entity
@Table(name="empresa")
public class Empresa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpresa;

    @Column(name="noombre")
    private String nombre;

    private String descripcion;

    public Empresa(int idEmpresa, String nombre, String descripcion) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
