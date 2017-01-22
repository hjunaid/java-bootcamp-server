package com.javabootcamp.model;

import com.javabootcamp.services.StockService;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockListMockServiceTest {

	@Autowired
	private StockService mockService;

	@Test
	public void searchStocks(){
	  List<Stock> stocks =	mockService.getStocks("British");
	  Assert.assertTrue(stocks.size()>0);
	}
}
