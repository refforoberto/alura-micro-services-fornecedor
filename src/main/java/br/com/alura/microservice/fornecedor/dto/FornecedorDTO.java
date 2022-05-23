package br.com.alura.microservice.fornecedor.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.microservice.fornecedor.model.FornecedorEntity;

public class FornecedorDTO {

	private Long id;

	private String nome;

	private String estado;

	private String endereco;

	public String getEndereco() {
		return endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public static List<FornecedorDTO> toDto( List<FornecedorEntity> list) {
		return list.stream().map(FornecedorDTO::toDto).collect(Collectors.toList());
	}

	public static FornecedorDTO toDto(FornecedorEntity entity) {
		FornecedorDTO dto = new FornecedorDTO();
		dto.setEndereco(entity.getEndereco());
		dto.setId(entity.getId());
		dto.setNome(entity.getNome());
		dto.setEstado(entity.getEstado());
		return dto;
	}
}
