package com.mwcc.openfeign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mwcc.openfeign.client.brapi.dto.StockDto;
import com.mwcc.openfeign.service.CotacaoBrapiService;

@RestController
@RequestMapping("/cotacao")
public record CotacaoBapiController(CotacaoBrapiService cotacaoBrapiService) {

	@GetMapping("/{stockId}")
	public StockDto cotacaoByStockId(@PathVariable String stockId) {
		return cotacaoBrapiService.getStock(stockId);
	}
	
}
