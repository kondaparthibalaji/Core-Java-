package com.exceptionhandling;

public class Testexception02 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		System.out.println("hello");
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.err.println("dont use zero in case of division");
		}
		System.out.println("hi");
		System.out.println("hello");


	}

}
