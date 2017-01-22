package com.javabootcamp.services;

import java.util.List;

import com.javabootcamp.model.Stock;

public interface StockService {

	public List<Stock> getStocks(String searchTerm);
}
