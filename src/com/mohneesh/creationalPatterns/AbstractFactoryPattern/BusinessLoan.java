package com.mohneesh.creationalPatterns.AbstractFactoryPattern;

public class BusinessLoan extends LoanAbstract {

	@Override
	void getInterestRate(double rate) {
		// TODO Auto-generated method stub
    this.rate=rate;
	}

}
