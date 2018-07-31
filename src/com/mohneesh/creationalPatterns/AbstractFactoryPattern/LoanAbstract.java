package com.mohneesh.creationalPatterns.AbstractFactoryPattern;

public abstract class LoanAbstract {

	protected double rate;
	
	abstract void getInterestRate(double rate);
	
	public void calculateLoanPayment(double loanamount, int years) {
		double emi;
		int n;
		n=years*12;
		 rate=rate/1200;  
         emi=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;  
	
	}
	
	
}
