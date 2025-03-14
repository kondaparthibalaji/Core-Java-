package com.arrays;

public class Arrays1 {

	public static void main(String[] args) {
	 int []numbers= { 5,3,6,2,4};
	 int sum=0;
	 int avg=0;
	 
	 for(int i=0; i<numbers.length;i++) {
		 sum=sum+numbers[i];
		 avg=sum/numbers.length;
	 }
		 System.out.println(sum);
		 System.out.println(avg);
	 

	int []ages=new int [5];
		ages[0]=20;
		ages[1]=21;
		ages[2]=22;
		ages[3]=23;
		ages[4]=24;
		
		 for(int i=0; i<ages.length;i++) {
			 System.out.println(ages[i]);
		 }
	}
}
