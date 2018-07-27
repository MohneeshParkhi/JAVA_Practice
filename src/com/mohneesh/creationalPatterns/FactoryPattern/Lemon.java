package com.mohneesh.creationalPatterns.FactoryPattern;

public class Lemon implements Fruits {

	@Override
	public String taste() {

		return "BIITER AND SOUR";
	}

	@Override
	public String name() {

		return "LEMON";
	}

}
