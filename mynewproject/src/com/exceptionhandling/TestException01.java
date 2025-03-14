package com.exceptionhandling;

import java.util.Scanner;

public class TestException01 {

	public static void main(String[] args) {
		System.out.println("started main method");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		
		try {
		System.out.println(a/b);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("good morning");
		System.out.println("have a nice day");
		
		String s=null;
		System.out.println(s.length());

	}

}
