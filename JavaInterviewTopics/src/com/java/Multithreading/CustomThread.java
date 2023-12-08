package com.java.Multithreading;

import java.util.Iterator;

public class CustomThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
	
}
