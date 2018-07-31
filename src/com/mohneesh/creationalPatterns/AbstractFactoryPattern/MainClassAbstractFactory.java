package com.mohneesh.creationalPatterns.AbstractFactoryPattern;

import java.util.Scanner;

public class MainClassAbstractFactory {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Bank name to take loan");
	String input=scan.nextLine();
	
	
	System.out.print("Enter the type of loan e.g. home loan or business loan : ");  
	
	String loanName = scan.nextLine();

	
	AbstractFactory bankFact = FactoryCreator.getFactory("Bank");
	
	
    Bank bff= bankFact.getBank("HDFC");
    
    
    System.out.println("Bank name is"+bff.getBankName());
    
    
    AbstractFactory loanFact = FactoryCreator.getFactory("Loan");
    
    LoanAbstract loan = loanFact.getLoan("Business");
    
    System.out.println("Loan type :"+loan.rate);
    
    


}
}
