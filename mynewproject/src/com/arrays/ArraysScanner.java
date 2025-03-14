package com.arrays;

import java.util.Scanner;

public class ArraysScanner {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("can u please enter the array size:");
		int n =sc.nextInt();
		int []numbers=new int[n];
		
		System.out.println("can u enter the array elements;");
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=sc.nextInt();
		}
			for(int i=0;i<numbers.length;i++) {
				if(!(numbers[i]%2==0)) {
					System.out.println(numbers[i]);
				}
			}

	}

}
