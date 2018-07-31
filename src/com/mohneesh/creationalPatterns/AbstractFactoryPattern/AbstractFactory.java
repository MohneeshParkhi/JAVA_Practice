package com.mohneesh.creationalPatterns.AbstractFactoryPattern;

public abstract class AbstractFactory {

	public abstract Bank getBank(String Bank);
	public abstract LoanAbstract getLoan(String Loan);
	
}
