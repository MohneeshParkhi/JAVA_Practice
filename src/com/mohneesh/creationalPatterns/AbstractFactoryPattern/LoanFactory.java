package com.mohneesh.creationalPatterns.AbstractFactoryPattern;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String Bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanAbstract getLoan(String Loan) {
		if(Loan.equals(null))
		return null;
		
		if(Loan.equalsIgnoreCase("Business"))
			return new BusinessLoan();
		
		
		if(Loan.equalsIgnoreCase("Home"))
			return new HomeLoan();
		
		
		return null;
	}

}
