package com.oops;

import java.util.Scanner;

public class Testperfectnumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				count=count+i;
			}
		}
	if (n==count) {
		System.out.println("its a perfect number");
	}else {
		System.out.println("its not a perfect number");
	}
		
	}

}
