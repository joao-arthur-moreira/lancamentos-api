package com.jajm.lancamentosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jajm.lancamentosapi.model.Lancamento;
import com.jajm.lancamentosapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
