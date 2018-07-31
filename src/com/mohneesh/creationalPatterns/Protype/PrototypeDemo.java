package com.mohneesh.creationalPatterns.Protype;

public class PrototypeDemo {
public static void main(String[] args) {
	Employee emp = new Employee("Mohneesh","HCL");
	
	System.out.println("Original Objects fields");
	emp.showRecord();
	
	
	Employee p = (Employee) emp.getClone();
	
	p.showRecord();
}
}
