package com.oops;

public interface ANIMAL {
	
	int n=1000;
	
	String makesound();
	
	 String hunting();

	 String running();
	
	  default void method1(){
		 method3();
		 System.out.println("hello default method");  
	 }
	 static void method2() {
		System.out.println("hello static method"); 
	 }
	private void method3(){
		System.out.println("hello private method3"); 
	}

}
