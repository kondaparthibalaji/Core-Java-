package com.demo;

import java.util.Scanner;

public class SquareChecker {
	
	public static boolean isPerfectSquare(int num) {
		if (num<0) {
			return false;
		}
			int sqrt=(int)Math.sqrt(num);
			return (sqrt*sqrt==num);
	}



	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		if(isPerfectSquare(num)) {
			System.out.println("given number is perfect square");
		}else
		{System.out.println("given number is not perfect square");


	}

}
}