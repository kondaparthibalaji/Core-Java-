package com.oops;

import java.util.Scanner;

public class Testfibonacci {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter how many numbers want to print");
		int n=sc.nextInt();
		int a=1,b=0,c=0;
		int count=0;
		while(count<n){
			c=a+b;
			System.out.println(c);
			count=count+1;
			b=a;
			a=c;
		
		}
			
		}
	
		
}
