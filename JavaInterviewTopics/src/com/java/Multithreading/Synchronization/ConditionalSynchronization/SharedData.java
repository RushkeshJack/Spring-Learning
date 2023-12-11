package com.java.Multithreading.Synchronization.ConditionalSynchronization;

public class SharedData {

	public int data;
	private boolean writable=true;
	public synchronized void produce(int x) {
		if (writable==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		data=x;
		System.out.println("Produced : " + data);
		writable = false;
		notify();
	}
	
	public synchronized int consume() {
		if (writable) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		writable = true;
		notify();
		return data;
	}
	
}
