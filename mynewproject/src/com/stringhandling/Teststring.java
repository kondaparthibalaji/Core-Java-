package com.stringhandling;

public class Teststring {

	public static void main(String[] args) {
		
		String s="Balu";
		System.out.println(s);
		
		String s1=new String("Varun");
		System.out.println(s1);
		
		if(s.equals(s1)) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}
		
		if (s==s1) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}

	}

}
