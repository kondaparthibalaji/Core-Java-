package com.java8features;

//passing runnable interface to thread without implementation class
//class Myrunnable implements Runnable{
//	public void run() {
//		for(int i=1;i<=10;i++) {
//			System.out.println("child thread");
//		}
//	}
//}
public class LamdaRun {

	public static void main(String[] args) {
		
		Runnable r=()->{
			for(int i=1;i<=20;i++) {
				System.out.println("child thread");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=1;i<=20;i++) {
			System.out.println("main thread");
		}


	}

}
