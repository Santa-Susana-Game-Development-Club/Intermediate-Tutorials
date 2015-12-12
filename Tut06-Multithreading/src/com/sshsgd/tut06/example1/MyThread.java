package com.sshsgd.tut06.example1;
/**
 * By definition multitasking is when multiple processes share common processing resources 
 * such as a CPU. Multi threading extends the idea of multitasking into applications where 
 * you can subdivide specific operations within a single application into individual threads. 
 * Each of the threads can run in parallel. The OS divides processing time not only among 
 * different applications, but also among each thread within an application.
 *
 * Multi threading enables you to write in a way where multiple activities can proceed 
 * concurrently in the same program.
 *
 */
public class MyThread extends Thread {

	private String message;
	private int numIterations;
	
	public MyThread(String message, int numIterations) {
		super();
		this.message = message;
		this.numIterations = numIterations;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < numIterations; i++) {
			System.out.println(message);
			try {
				sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
