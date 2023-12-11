package com.java.Multithreading.JoinMethod;

public class TesterForJoinMethod {

	public static void main(String[] args) throws InterruptedException{
		
		CustomThread thread = new CustomThread();
		thread.start();
		thread.join();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
	
}
