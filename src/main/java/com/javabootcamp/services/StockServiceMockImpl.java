package com.javabootcamp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.javabootcamp.model.Stock;

@Component
public class StockServiceMockImpl implements StockService{

	private List<Stock> stocks = new ArrayList<>();
	
	public StockServiceMockImpl() {
		stocks = new ArrayList<>();
		stocks.add(new Stock("British Telecom", 400, 399));
	}

	public List<Stock> getStocks(String searchTerm){
		return stocks.stream()
				.filter(s->s.getName().contains(searchTerm))
				.collect(Collectors.toList());
	}
}
