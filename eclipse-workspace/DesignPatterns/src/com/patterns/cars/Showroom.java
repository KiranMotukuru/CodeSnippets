package com.patterns.cars;

public class Showroom {

	public static void main(String[] args) {
		
		Factory f = new Factory();
		Garage buuyingCars = f.carsForSelling("Audi");
		      buuyingCars.newCars();
		      
		        Garage carsForSelling = f.carsForSelling("bmw");
		        carsForSelling.newCars();
	}

}
