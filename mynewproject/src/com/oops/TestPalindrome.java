package com.oops;

import java.util.Scanner;

public class TestPalindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int r=0;
		int reverse=0;
		int num=n;
		while(n>0) {
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
		}if(num==reverse) {
			System.out.println("its a palindrome number");
		}else {
			System.out.println("its not a palindrome number");
		}
	}

}
