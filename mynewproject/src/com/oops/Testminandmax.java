package com.oops;

public class Testminandmax {

	public static void main(String[] args) {
		int[]a= {8,4,6,9,0,2};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}if(a[i]>max) {
				max=a[i];
			}
		}System.out.println("max;"+max+"min;"+min);

	}
}
