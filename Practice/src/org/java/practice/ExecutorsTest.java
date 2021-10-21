package org.java.practice;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsTest {

	
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		ExecutorService executor =Executors.newFixedThreadPool(300);
		executor.submit(new Rajesh());
		executor.shutdown();
		
	}
}


class Rajesh implements   Runnable {
		
		
			
			@Override
			public void run() {
					for(int i=0;i<=500;i++) {
						
						System.out.println("hello");
						System.out.println(Thread.currentThread().getName());
						
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
			}
		
		
	
}
