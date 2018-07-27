package com.mohneesh.creationalPatterns.FactoryPattern;

public class Guava implements Fruits {

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Could be SOUR or SWEET, Depends on ripeness";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "GUAVA";
	}

}
