package com.upiiz.actividad3.categorias;

import java.util.List;

import org.springframework.stereotype.Service;

import com.upiiz.actividad3.categorias.dto.CategoriaDto;
import com.upiiz.actividad3.categorias.dto.NuevaCategoriaDto;
import com.upiiz.actividad3.categorias.entities.CategoriaEntity;

// Capa de negocio
@Service 
public class CategoriaServiceImpl implements CategoriaService{
    
    private CategoriaRepository categoriaRepository;

    CategoriaServiceImpl(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

	@Override
	public List<CategoriaDto> findAll() {
		return List.of();
	}

	@Override
	public CategoriaDto save(NuevaCategoriaDto nuevaCategoriaDto) {
        // En el servicio van LAS REGLAS DE NEGOCIO que se deben cumplir 
        categoriaRepository.findByDescripcionIgnoreCase(nuevaCategoriaDto.getDescripcion()).ifPresent(e->{
            // Madnda un error
            // Termina el método
            throw new IllegalArgumentException("La categoría ya existe");
        });
        CategoriaEntity nuevaCategoria = new CategoriaEntity(nuevaCategoriaDto.getDescripcion()); 
        CategoriaEntity categoriaGuardada = categoriaRepository.save(nuevaCategoria);
        System.out.println("Yoli");

        return new CategoriaDto(categoriaGuardada.getId(), categoriaGuardada.getDescripcion());

        // Reglas de negocio
        // Una de ellas que no se suplique el nombre de la categoría
        // No importa si es con mayúscula o minúscula
        // No de debe de duplicar	
        
        }

	@Override
	public CategoriaDto update(Long id, NuevaCategoriaDto nuevaCategoriaDto) {
		return null;
	}

	@Override
	public void delete(Long id) {
	}

}
