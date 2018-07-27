package hcl.mohneeshPatterns.adpater;

public class Sparrow implements Birds{

	@Override
	public void fly() {
		
		System.out.println("Sparrow is flying");
		
	}

	@Override
	public void chirp() {
		System.out.println("Chirp chirp chirp");
		
	}

}
