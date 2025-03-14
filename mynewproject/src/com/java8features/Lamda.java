package com.java8features;

interface Interf1 {
	abstract void method1();
	
	default void method2() {
		System.out.println("default methoddd");
	}
	static void method3() {
		System.out.println("static methodddd");
	}	
}
//class Balu implements Interf1 {
//	 public void method1() {
//		System.out.println("abstract method");
//	}
//}
 	 
public class Lamda {

	public static void main(String[] args) {
		Interf1 i=()->System.out.println("abstract method1");
		i.method1();
		i.method2();
		Interf1.method3();
		

	}

}
