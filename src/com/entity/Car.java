package com.entity;

public class Car {
	
	int Speed;
	double RegularPrice;
	String  color;

	public Car(int speed,double RegularPrice, String color ) {
		super();
		this.Speed = Speed;
		this.RegularPrice = RegularPrice;
		this.color = color;
	}

	public double getSalePrice() {
		return RegularPrice;
	}
	
}
