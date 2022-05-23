package br.com.alura.microservice.fornecedor.controller;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.dto.FornecedorDTO;
import br.com.alura.microservice.fornecedor.model.FornecedorEntity;
import br.com.alura.microservice.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;

	@RequestMapping("/{estado}")
	ResponseEntity<Object> obterInformacoesPorEstado(@PathVariable String estado) {
		try {
			FornecedorEntity entity = infoService.obterInformacoesPorEstado(estado);

			return ResponseEntity.ok(FornecedorDTO.toDto(entity));
		} catch (EntityNotFoundException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Erro ao buscar fornecedor");
		}
	}

}
