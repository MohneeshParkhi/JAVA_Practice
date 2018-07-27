package hcl.mohneeshPatterns.adpater;

public class AdapterClass implements Dog {

	//client will use this interface
	Birds bird;
	
	AdapterClass(Birds bird){
		this.bird= bird;
	}
	
	
	// changing the behaviour of Dog   
	
	@Override
	public void bark() {
	bird.chirp();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
    bird.fly();
	}

}
