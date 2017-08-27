package com.jajm.lancamentosapi.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jajm.lancamentosapi.model.Lancamento;
import com.jajm.lancamentosapi.repository.filter.LancamentoFilter;
import com.jajm.lancamentosapi.repository.projections.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
