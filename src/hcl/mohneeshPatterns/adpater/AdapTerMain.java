package hcl.mohneeshPatterns.adpater;

public class AdapTerMain {
public static void main(String[] args) {
	Birds bobj = new Sparrow();
	System.out.println("Calling the bidr objects");
	bobj.chirp();
	bobj.fly();
	
	
	Dog dobj= new Himanshu();
	System.out.println("Calling Dog object");
	
	dobj.bark();
	dobj.run();
	
	/* 
	 * Adaptee===> Bird object
	 * 
	 * Target => Dog 
	 * 
	 * Client himanshu
	 * 
	 * */
	System.out.println("Adapter pattern usage");
	
	Dog dodj= new AdapterClass(bobj);
	
	dodj.bark();
	dodj.run();
}
}
