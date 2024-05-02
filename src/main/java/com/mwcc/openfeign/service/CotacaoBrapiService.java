package com.mwcc.openfeign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mwcc.openfeign.client.brapi.BrapiClient;
import com.mwcc.openfeign.client.brapi.dto.StockDto;

@Service
public class CotacaoBrapiService {
	
	@Value("#{environment.TOKEN}")
	private String token;
	
	@Autowired
	private BrapiClient brapiClient;
	
	public StockDto getStock (String stockId) {
		
		var response = brapiClient.getQuote(this.token, stockId);
		StockDto result = response.results().get(0);
		
		return result;
	}

}
