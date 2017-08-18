package com.jajm.lancamentosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jajm.lancamentosapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
