package com.mohneesh.creationalPatterns.AbstractFactoryPattern;

public class ICICI implements Bank {
  private String bName;
  
    public ICICI(){
    	this.bName="ICICI Bank";
    }
  
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return bName;
	}

}
