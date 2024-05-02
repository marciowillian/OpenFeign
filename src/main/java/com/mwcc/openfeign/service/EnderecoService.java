package com.mwcc.openfeign.service;

import org.springframework.stereotype.Service;

import com.mwcc.openfeign.client.viacep.Endereco;
import com.mwcc.openfeign.client.viacep.ViacepClient;

@Service
public record EnderecoService(ViacepClient viacepClient) {

	public Endereco getEnderecoByCep (String cep) {
		Endereco endereco = viacepClient.getEndereco(cep);
		return endereco;
	}
	
}
