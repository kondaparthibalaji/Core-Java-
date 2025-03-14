package com.oops;

public class Testpeakelement {

	public static void main(String[] args) {
		int []a= {22,5,34,43,90,65};
		for(int i=1;i<a.length-1;i++) {
			if(a[i]>a[i+1]&&a[i]>a[i-1]) {
				System.out.println(a[i]);
			}
		}
	}

}
