package com.multithreading;

	class Testqueue {
		int num=0;
		boolean status=false;
		 synchronized void put (int i) throws InterruptedException{
			while(status) {
				wait();
			}
		this.num=i;
		System.out.println("put"+num);
		status=true;
		notify();}
		
		
		synchronized void get()throws InterruptedException {
			 while(!status) {
				 wait();
			 }
			 System.out.println("get"+num);
			 status=false;
			 notify();
			  }	
	}
	class Producer implements Runnable{
      Testqueue t1;
      Producer (Testqueue t1){
    	  this.t1=t1;
    	  Thread t2=new Thread(this);
        		  t2.start();
}
        public void run(){
        	int i=0;
        	while (true) {
    		  try{
    			  t1.put(i++);
    			  Thread.sleep(400);
    		  }
    		  catch (InterruptedException e) {
    		   e.printStackTrace();
    		   }
    	  }
      }
	}
        class Consumer implements Runnable{
        	Testqueue t1;
        	Consumer (Testqueue t1){
        		this.t1=t1;
        		Thread t3=new Thread(this);
        		t3.start(); }
        		
        		public void run() {
        			
        			while (true) {
        				try {
        					t1.get();
        					Thread.sleep(400);
        				}catch (InterruptedException e) {
        					e.printStackTrace();
        				}
        			}
        		}
        
        }

public class Testproducerconsumer {

	public static void main(String[] args) {
		Testqueue t1=new Testqueue();
		Producer p1=new Producer(t1);
		Consumer c1=new Consumer(t1);
	}

}
