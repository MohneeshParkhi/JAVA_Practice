package com.mohneesh.creationalPatterns.FactoryPattern;

public class Apple implements Fruits{

	@Override
	public String taste() {
		
   		return "Sweet";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "APPLE";
	}

}
