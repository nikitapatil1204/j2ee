package com.jspider.multithreading.Main;

import com.jspider.multithreading.threads.MyThread1;
import com.jspider.multithreading.threads.MyThread2;

public class ThreadMain {

	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2);
		thread.start();

	}

}
