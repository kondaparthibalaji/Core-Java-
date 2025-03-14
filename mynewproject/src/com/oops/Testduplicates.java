package com.oops;

public class Testduplicates {

	public static void main(String[] args) {
		Object[]a= {4,5,2,6,4,3,2,7};
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}if(count==2) {
				System.out.println(a[i]);
		}
		}
	}

}
