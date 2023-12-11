package com.java.Multithreading.Synchronization.ConditionalSynchronization;

public class Consumer extends Thread{

   SharedData data;
	
	public Consumer(SharedData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Consumed value is : "+data.consume());
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
	
}
