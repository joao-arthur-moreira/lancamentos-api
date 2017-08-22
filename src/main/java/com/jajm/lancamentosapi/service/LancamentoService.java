package com.jajm.lancamentosapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jajm.lancamentosapi.model.Lancamento;
import com.jajm.lancamentosapi.model.Pessoa;
import com.jajm.lancamentosapi.repository.LancamentoRepository;
import com.jajm.lancamentosapi.repository.PessoaRepository;
import com.jajm.lancamentosapi.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		if (pessoa == null || pessoa.isInativo()){
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lancamentoRepository.save(lancamento);
	}

}
