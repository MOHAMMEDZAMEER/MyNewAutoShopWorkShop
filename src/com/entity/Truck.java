package com.entity;

public class Truck extends Car {

	int weight;

	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	public double getSalePrice() {
		if (weight > 2000)
			return RegularPrice - (RegularPrice * 0.1);
		else
			return RegularPrice - (RegularPrice * 0.2);
	}
}
