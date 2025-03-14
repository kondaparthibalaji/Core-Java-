package com.JDBC;

public class Duplicate {

	public static void main(String[] args) {
		int arr[]= {15,17,17,13,14,15,13,6,4,3};
		int arr1[]= {15,17,17,13,14,15,13,6,4,3};
		
		for(int i=0;i<arr.length;i++) {
			int count=0;	
		for (int j=i;j<arr1.length;j++) {
			if (arr[i]==arr1[j]) 
				count++;
		}
			if(count==1)
				System.out.println(arr[i]);
		}
	}

}
