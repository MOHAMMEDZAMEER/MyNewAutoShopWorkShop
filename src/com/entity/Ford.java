package com.entity;

public class Ford extends Car {

	int year;
	int manufacturerDiscount;

	public Ford(int Speed, double RegularPrice, String color, int year, int manufacturerDiscount) {
		super(Speed, RegularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	public double getSalePrice() {
		return RegularPrice - RegularPrice * (manufacturerDiscount / 100.0);
	}
}