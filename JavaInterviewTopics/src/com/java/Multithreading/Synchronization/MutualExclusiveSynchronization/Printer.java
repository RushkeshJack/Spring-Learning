package com.java.Multithreading.Synchronization.MutualExclusiveSynchronization;


public class Printer {

	//******synchronized keyword at method level******//
	
//	synchronized void print(int x) {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(Thread.currentThread().getName()+" - "+(x*i));
//		}
//	}
	
	
	//******synchronized keyword at block level******//
	
//	public void print(int x) {
//		
//		synchronized (this) {
//			for (int i = 1; i <= 10; i++) {
//				System.out.println(Thread.currentThread().getName()+" - "+(x*i));
//			} 
//		}
//		
//		
//	}
	
	//****** Static Synchronization ******//
	
    public synchronized static void print(int x) {
		
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName()+" - "+(x*i));
			} 
		
	}
}
