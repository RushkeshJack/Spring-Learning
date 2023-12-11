package com.java.Multithreading.Synchronization.ConditionalSynchronization;

public class Tester {
	
	public static void main(String[] args) {
		
		SharedData data = new SharedData();
		Producer producerThread = new Producer(data);
		Consumer consumerThread = new Consumer(data);
		
		producerThread.start();
		consumerThread.start();
		
	}

}
