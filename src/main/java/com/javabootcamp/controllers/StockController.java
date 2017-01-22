package com.javabootcamp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabootcamp.model.Stock;
import com.javabootcamp.services.StockService;

@RestController
@RequestMapping("/")
public class StockController {
	
	@Autowired
	private StockService stockService;

	@RequestMapping("health")
	public String ping(){
		return "Ok";
	}
	
	@RequestMapping("stocks/{searchTerm}")
	public List<Stock> getStocks(@PathVariable("searchTerm") String searchTerm){
		return stockService.getStocks(searchTerm);
	}
}
