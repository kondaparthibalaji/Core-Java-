package com.multithreading;

class Balu extends TestA implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Balu thread:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Varun extends TestA implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Varun thread:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class TestMainThread {

	public static void main(String[] args) {
		Balu b=new Balu();
		Thread t=new Thread(b);
		t.start();
		Varun v=new Varun();
		Thread t1=new Thread(v);
		t1.start();
	}

}
