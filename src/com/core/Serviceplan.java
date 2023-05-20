package com.core;

public enum Serviceplan {
    GOLD(2000),SILVER(1000),DIAMOND(10000),PLATINUM(5000);
    private Serviceplan(double price) {
		this.price = price;
	}
    

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	private double price;
	
}
