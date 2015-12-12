package com.sshsgd.tut06.example1;

public class MainOne {

	public static void main(String[] args) {
		MyThread t1, t2;

		t1 = new MyThread("Hello from Thread 1!", 3);
		t2 = new MyThread("Hello from Thread 2!", 5);
		
		t1.start();
		t2.start();
		
	}

}
