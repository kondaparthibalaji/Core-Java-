package com.arrays;

public class ArraysMinMax {

	public static void main(String[] args) {
	  int []n= {-10,30,25,-15,45,80};
	  
	  int min=n[0];//-10 -15
	  int max=n[0];//-10 30 45 80
	  
	  for(int i=0;i<n.length;i++) {
		 if (n[i]<min) {
			 min=n[i];
		 }	 
		 if (n[i]>max) {
			 max=n[i];
		 }
	  }
		 	System.out.println(min);
		 	System.out.println(max);
	  

	}

}
