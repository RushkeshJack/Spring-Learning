package com.java.Multithreading.Synchronization.MutualExclusiveSynchronization;

public class Thread2 extends Thread{

	//**** Below code for synchronized keyword at method and block level ****//

	//    Printer table;
//	
//	public Thread2(Printer table) {
//		this.table = table;
//	}
//	
//	@Override
//	public void run() {
//		this.table.print(4);
//	}
	
	
	
	//**** Below code for synchronized keyword at method and block level ****//

	@Override
	public void run() {
		Printer.print(4);
	}
}
