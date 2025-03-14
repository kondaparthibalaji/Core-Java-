package com.oops;

public class TestArmstrong {

	public static void main(String[] args) {
		int n=153,count=0,r=0;
		int num=n;
		while(n>0) {
			r=n%10;
			count=count+r*r*r;
			n=n/10;
		}if (num==count) {
			System.out.println("its a armstrong");
		}else {
			System.out.println("its not ");
		}
		
	}

}
