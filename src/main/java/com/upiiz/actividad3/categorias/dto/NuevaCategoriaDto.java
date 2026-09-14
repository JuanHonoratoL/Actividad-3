package com.upiiz.actividad3.categorias.dto;

// Recoibir datos del cliente (Chrome, Insomnia)

public class NuevaCategoriaDto {
    private String descripcion;

    public NuevaCategoriaDto(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return  descripcion;
    }


}
