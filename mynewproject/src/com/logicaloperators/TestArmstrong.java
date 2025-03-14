package com.logicaloperators;

public class TestArmstrong {
	
	public static void main(String[] args) {
		int sum=0;
		 int n=153;

		while(n>0) {
			int r = n%10;
			int m =n/10;
			sum=(int)Math.pow(r, 3);
		}
		if(sum==n) {
			System.out.println("number is armstrong");
		}else {
			System.out.println("number is not a armstrong");
		}
		
		

	}

}
