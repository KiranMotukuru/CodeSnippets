package com.patterns.cars;

public class Factory {

	Garage carsForSelling(String model) {
		if (model.equalsIgnoreCase("Bmw")) {
			Garage s = new Bmw();
			return s;

		}

		if (model.equalsIgnoreCase("Audi")) {
			Garage s = new Audi();
			return s;

		}

		return null;

	}

}
