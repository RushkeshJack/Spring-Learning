package com.java.Multithreading.Synchronization.MutualExclusiveSynchronization;

public class Thread1 extends Thread{

	//**** Below code for synchronized keyword at method and block level ****//

//	Printer table;
//	
//	public Thread1(Printer table) {
//		this.table = table;
//	}
//	
//	@Override
//	public void run() {
//		this.table.print(5);
//	}
	
	
	//**** Below code for synchronized keyword at static level ****//

	@Override
	public void run() {
		Printer.print(5);
	}
	
}
