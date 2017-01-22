package com.javabootcamp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class StockController {

	@RequestMapping("")
	public String ping(){
		return "Hello";
	}
}
