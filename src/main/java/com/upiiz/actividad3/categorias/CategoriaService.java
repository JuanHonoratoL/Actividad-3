package com.upiiz.actividad3.categorias;

import com.upiiz.actividad3.categorias.dto.NuevaCategoriaDto;

import java.util.List;

import com.upiiz.actividad3.categorias.dto.CategoriaDto;

// Capa de servicio
// Contrato - Entre Programadores
public interface CategoriaService {
    // Jefe especifica los detalles del contrato
    CategoriaDto save(NuevaCategoriaDto nuevaCategoriaDto);

    // Muestre todas las categorías
    List<CategoriaDto> findAll();

    // Que actualice una categoría
    CategoriaDto update(Long id, NuevaCategoriaDto updateCategoriaDto);

    // Borre una categoría
    void delete(Long id);
}
