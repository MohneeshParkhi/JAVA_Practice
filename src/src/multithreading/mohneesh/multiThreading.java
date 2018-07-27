package src.multithreading.mohneesh;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class multiThreading {

	
	public static void main (String args[]){
		
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i=0;i<10;i++) {
		Runnable worker = new MyThread(" "+i);
		executor.execute(worker);
		
		}
		executor.shutdown();
		
		while(!executor.isTerminated()) {
			
		}
		
		System.out.println("System Of Threads is terminated");
	} 
	
	
}
