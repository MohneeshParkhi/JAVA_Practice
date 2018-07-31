package com.mohneesh.creationalPatterns.AbstractFactoryPattern;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String Bank) {
		if (Bank==null)
		return null;
		
		if(Bank.equalsIgnoreCase("HDFC"))
			return new HDFC();
		
		if(Bank.equalsIgnoreCase("ICICI"))
			return new ICICI();
		
		return null;
	}

	@Override
	public LoanAbstract getLoan(String Loan) {
		
		
		
		return null;
	}

}
