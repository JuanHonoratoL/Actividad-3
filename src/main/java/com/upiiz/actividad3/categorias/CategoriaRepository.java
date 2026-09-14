package com.upiiz.actividad3.categorias;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upiiz.actividad3.categorias.entities.CategoriaEntity;

// Capa de persistencia - ORM - JPA - Mongoose, TypeORM, Squalize

@Repository 
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long>{
    // Agregar más métodos
    Optional<CategoriaEntity> findByDescripcionIgnoreCase(String descripcion);
    
}
