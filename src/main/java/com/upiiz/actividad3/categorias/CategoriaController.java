package com.upiiz.actividad3.categorias;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upiiz.actividad3.categorias.dto.CategoriaDto;
import com.upiiz.actividad3.categorias.dto.NuevaCategoriaDto;

// Conteine los controlers, lo que recibe la solicitud y también envía los datos que se presentarán al usuario
// Capa de presentación - {JSON} - Navegador, Cliente REST (Insomnia, PostMan)
@RestController 
@RequestMapping("/categorias")
public class CategoriaController {

    private CategoriaServiceImpl categoriaService;
    
    CategoriaController(CategoriaServiceImpl categoriaService){
        this.categoriaService = categoriaService;
    }

    // Varios endpoint o rutas
    // Get de todas las categorías 
    // Get de solo una categoría
    // Post de una categoría
    // Put de una categoría
    @PostMapping("/guardarCategoria")
    public CategoriaDto save(@RequestBody NuevaCategoriaDto nuevaCategoriaDto){
        return categoriaService.save(nuevaCategoriaDto);
    }

    // Delete de una categoría
}

