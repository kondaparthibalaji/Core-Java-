package com.arrays;

public class Array2Dimension {

	public static void main(String[] args) {
		int[][]n=new int[2][2];
		//00 01 02
		//10 11 12
		//20 21 22
		
		n[0][0]=1;
		n[0][1]=2;
		n[1][0]=3;
		n[1][1]=4;
		
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]+" ");//01 02 03 
			}System.out.println();
		}

	}

}
