package com.mohneesh.creationalPatterns.FactoryPattern;

public class FruitsFactory {

	public static FruitsFactory getInstance() {
		return new FruitsFactory();
	}

	public Fruits getObject(String name) {

		if (name.equals(null))
			return null;

		if (name.equals("GUAVA"))
			return new Guava();

		if (name.equals("LEMON"))
			return new Lemon();

		if (name.equals("APPLE"))
			return new Apple();
		
		return null;

	}

}
