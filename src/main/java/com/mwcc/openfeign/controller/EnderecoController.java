package com.mwcc.openfeign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mwcc.openfeign.client.viacep.Endereco;
import com.mwcc.openfeign.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public record EnderecoController(EnderecoService enderecoService) {

	@GetMapping("/{cep}")
	public Endereco enderecoByCep(@PathVariable String cep) {
		return enderecoService.getEnderecoByCep(cep);
	}
	
}
