package com.upiiz.actividad3.categorias.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Capa de base de datos

@Entity
@Table(name = "categoria")
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;


    public CategoriaEntity(){

    }

    public CategoriaEntity(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public CategoriaEntity(String descripcion){
        this.descripcion = descripcion;
    }


    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return  descripcion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }



}
