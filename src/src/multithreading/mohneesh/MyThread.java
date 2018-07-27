package src.multithreading.mohneesh;

public class MyThread implements Runnable {

	
	public String name;
	
	
	public MyThread(String s) {
		name=s;
	}
	
	
	@Override
	public void run() {
		// printing thread name
		System.out.println(Thread.currentThread().getName()+" Start  "+name);
		processName(); // claling to sleep a thread
		System.out.println(Thread.currentThread().getName()+ "  " +"END ");
                  
	}

	
	public void processName() {
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ie  ){
			System.out.println(ie);
		}
	} 
	
}
