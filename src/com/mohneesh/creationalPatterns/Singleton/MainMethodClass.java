package com.mohneesh.creationalPatterns.Singleton;

public class MainMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		AppleSingleton sObj, s1Obj;
		
		/* If i go with given below code of line, then there will be
		 * visibility error.
		   sObj = new AppleSingleton();
		*/
	
	   sObj = AppleSingleton.getInstance();
	   
	   s1Obj = AppleSingleton.getInstance();
	   System.out.println("sObj hashCode :" +sObj.hashCode());
	   
	   System.out.println("s1Obj HashCode :"+s1Obj.hashCode());
	
	}

}
