package com.upiiz.actividad3.categorias.dto;

// Contestar al cliente

public class CategoriaDto {
    private Long id;
    private String descripcion; 

    public CategoriaDto(Long id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public Long getId() {
        return this.id;
    }

    public String getDescripcion(){
        return this.descripcion;
    }




}
