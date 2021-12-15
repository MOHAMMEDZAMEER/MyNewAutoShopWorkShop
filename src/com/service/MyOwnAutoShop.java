package com.service;

import com.entity.Car;
import com.entity.Ford;
import com.entity.Sedan;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan = new Sedan(50, 1000, "red", 25);
		System.out.println(" Sedan Price: " + sedan.getSalePrice());

		Ford fordRed = new Ford(50, 1000, "white", 1975, 20);
		System.out.println(" Ford Price: " + fordRed.getSalePrice());

		Ford fordGold = new Ford(50, 1000, "gold", 1968, 3);
		System.out.println(" Ford Price: " + fordGold.getSalePrice());

		Car car = new Car(50, 1000, "black");
		System.out.println(" Car Price: " + car.getSalePrice());
	}
	}


