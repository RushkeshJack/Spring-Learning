package com.java.Multithreading;

public class Tester {
	
	public static void main(String[] args) {
		
		//Lambda expression for directly creating object of 
		//runnable function interface
//		Runnable runnable = () -> {
//			System.out.println("Run method of Runnable class");
//		};
//		
//		Thread thread = new Thread(runnable);
//		thread.start();
		
		//Normal method is class implement runnable interface and
		//extends run() method after that
		//create object of that class in main class.
		
		MyThread myThread = new MyThread();
		MyThread2 myThread2 = new MyThread2();
		
		Thread thread = new Thread(myThread);
		
		thread.start();
		myThread2.start();
		
		Thread.currentThread().setName("Main Thread");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(Thread.currentThread().getName());
		
		
		
		
	}

}
