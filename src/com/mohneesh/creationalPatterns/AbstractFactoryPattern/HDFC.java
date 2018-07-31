package com.mohneesh.creationalPatterns.AbstractFactoryPattern;

public class HDFC implements Bank {

	
	private String bName;
	
	public HDFC() {
		this.bName="HDFC Bank Name";
	}
	
	
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return bName;
	}

}
