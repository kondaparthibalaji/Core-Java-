package com.oops;

	class A {
	void method1() {
	System.out.println("hello");
	}
	 void method2() {
		 System.out.println("hii");
	 }
	}
	 class B extends A{
		 void method1() {
			System.out.println("good morning"); 
		 }
		 void method3() {
			 System.out.println("good afternoon");
		 }
	 }
	 class C extends B{
		 
		 void method1() {
			 System.out.println("balaji");
		 }
		 void method3() {
			 System.out.println("good evening");
		 }
		 
	 }
 
public class Testdemo10 {
	
	public static void main(String[] args) {
		C c = new C();
		c.method1();
		c.method3();
	}

}
