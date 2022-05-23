package br.com.alura.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.fornecedor.model.FornecedorEntity;

@Repository
public interface FornecedorRepository  extends CrudRepository<FornecedorEntity, Long> {	
	FornecedorEntity findByEstado(String estado);

}
