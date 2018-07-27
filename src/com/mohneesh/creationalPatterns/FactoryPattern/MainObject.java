package com.mohneesh.creationalPatterns.FactoryPattern;

import java.util.Scanner;

public class MainObject {

	public static void main(String args[]) {

		System.out.println("Enter the string to have objects from factory");

		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.println("Inputed String is : " + input);

		FruitsFactory obj = FruitsFactory.getInstance();

		System.out.println("Getting various instances");

		Fruits fobj = obj.getObject(input);

		System.out.println("Name of Fruits :" + fobj.name());
		System.out.println("Taste of Fruits :" + fobj.taste());

		System.out.println("Factory Pattern is implemented");

	}
}
