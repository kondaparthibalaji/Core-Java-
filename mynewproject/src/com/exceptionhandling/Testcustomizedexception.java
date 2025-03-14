package com.exceptionhandling;

import java.util.Scanner;

public class Testcustomizedexception  {

	public static void main(String[] args) throws BalajiException {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if (age>=18) {
			System.out.println("eligible for voting and driving");
		}else {
			throw new BalajiException("not eligible for both");
		}
	}

}
