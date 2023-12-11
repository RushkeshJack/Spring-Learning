package com.java.Multithreading.Synchronization.ConditionalSynchronization;

public class Producer extends Thread{

	SharedData data;
	
	public Producer(SharedData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			this.data.produce(i);
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
}
