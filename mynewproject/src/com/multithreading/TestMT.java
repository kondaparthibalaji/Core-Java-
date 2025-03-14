package com.multithreading;

	class Mythread1 extends Thread{
	 public void run() {
	 System.out.println("The thread started");
	for (int i=50;i<=100;i++)
	//System.out.println("t1 ;"+i);
	{System.out.println("The thread ended 111");
		}
	}
	}
	class Mythread2 extends Thread{
		public void run() {
			System.out.println("The thread started");
			for (int i=100;i<=150;i++)
				//System.out.println("t2 ;"+i);
			{System.out.println("The thread ended 222");
			}
		}
	}
	class Mythread3 extends Thread{
		public void run() {
			System.out.println("The thread started");
			for (int i=150;i<=200;i++)
				//System.out.println("t3 ;"+i);
			{System.out.println("The thread ended 333");
			}
			}
	}
	public class TestMT
	{
	public static void main(String[] args)
	{
		Mythread1 t1= new Mythread1();
		Mythread2 t2= new Mythread2();
		Mythread3 t3= new Mythread3();
		t1.start();
		t2.start();
		t3.start();
	}
}

	
	
	

