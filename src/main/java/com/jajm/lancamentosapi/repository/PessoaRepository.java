package com.jajm.lancamentosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jajm.lancamentosapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
