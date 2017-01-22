package com.javabootcamp.model;

public class Stock {

	private String name;
	private float buy;
	private float sell;
	
	
	
	public Stock(String name, float buy, float sell) {
		super();
		this.name = name;
		this.buy = buy;
		this.sell = sell;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBuy() {
		return buy;
	}
	public void setBuy(float buy) {
		this.buy = buy;
	}
	public float getSell() {
		return sell;
	}
	public void setSell(float sell) {
		this.sell = sell;
	}
	
	
}
