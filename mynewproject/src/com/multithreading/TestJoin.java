package com.multithreading;

class Thanks extends Thread{
	
	public void run() {
		for(int i=50;i<100;i++) {
			
			System.out.println("t:"+i);
		}
	}
}

class Welcome extends Thread{
	Thanks h;
	public Welcome(Thanks h) {
		this.h=h;
	}

	public void run() {
		for(int i=1;i<50;i++) {
			//if (i==25) {
				try {
					h.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println("w:"+i);
		}
		}
}
class Balu1 extends Thread{
	Thanks h;
	public Balu1(Thanks h) {
		this.h=h;
	}
	Welcome w;
	public Balu1(Welcome w) {
		this.w=w;
	}
	public void run() {
		for(int i=100;i<150;i++) {
			try {
				h.join();
				w.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("b:"+i);
		}
	}
}


public class TestJoin {

	public static void main(String[] args) {
		Thanks h=new Thanks();
		h.start();
		Welcome w=new Welcome(h);
		w.start();
		Balu1 b=new Balu1(h);
		b.start();
		Balu1 b1=new Balu1(w);
		b1.start();
		
		
	}

}
