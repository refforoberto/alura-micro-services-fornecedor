package br.com.alura.microservice.fornecedor.service;


import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.alura.microservice.fornecedor.model.FornecedorEntity;
import br.com.alura.microservice.fornecedor.repository.FornecedorRepository;

@Service
public class InfoService {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;

	@Transactional(readOnly = true)
	public FornecedorEntity obterInformacoesPorEstado(String estado) throws Exception {
		try {
			 FornecedorEntity fornecedor = fornecedorRepository.findByEstado(estado);
			if (fornecedor == null) {
				throw new EntityNotFoundException("Fornecedor não encontrado");
			}	
			return fornecedor; 	
		} catch (Exception e) {
			throw e;
		}	
	}

}
