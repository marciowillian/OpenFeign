package com.mwcc.openfeign.client.viacep;

public record Endereco (
		String cep,
		String logradouro,
		String complemento,
		String bairro,
		String localidade,
		String uf,
		String ibge,
		Integer ddd,
		Long siafi
		){

}
