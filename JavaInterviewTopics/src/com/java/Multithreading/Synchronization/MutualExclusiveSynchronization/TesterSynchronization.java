package com.java.Multithreading.Synchronization.MutualExclusiveSynchronization;

public class TesterSynchronization {


	public static void main(String[] args) {

		//**** Below code for synchronized keyword at method and block level ****//

//		Printer printer = new Printer();
//		
//		Thread1 thread1 = new Thread1(printer);
//		Thread2 thread2 = new Thread2(printer);
//		
//		thread1.start();
//		thread2.start();
		
		
		//**** Below code for synchronized keyword at static level ****//
		
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		thread1.start();
		thread2.start();
		
	}
	
}
