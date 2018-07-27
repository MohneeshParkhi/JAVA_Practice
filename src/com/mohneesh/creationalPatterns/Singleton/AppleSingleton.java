package com.mohneesh.creationalPatterns.Singleton;

public class AppleSingleton {
   
	
	/*
	 *  designing the private constructor to avoid uniform access to class from
	 * Outside this class
	 *
	 */
	private AppleSingleton() {}
	
	// Early instantiation....
	private static AppleSingleton obj  = new AppleSingleton();
	
	private static AppleSingleton oj;
	
	
	// Global point of access to instance..
	
	public static AppleSingleton getInstance() {
	  // call this, will get same instance for multiple request	
		return obj;
	}
	
	
	/* this method will give you 
	
	 * different instance as instantiation is occurring every time
	 * 
	 * whenerver user will call this method, however reference object nature is 
	 * 
	 * static i.e variable will have memory in class area during runtime.
	 */
	public static AppleSingleton getDifferentInst() {
		oj = new AppleSingleton();
		return oj;
	}
	
	
}
