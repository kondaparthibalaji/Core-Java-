package com.arrays;

public class ArrayString {

	public static void main(String[] args) {
		String[]names=new String[5];
		
		names[0]="Spicy";
		names[1]="Akhi";
		names[2]="Kiwi";
		names[3]="Bujji";
		names[4]="Siri";
		
		for(int i=0;i<names.length;i++) {
			//if(names[i].contains("S")) {
				//System.out.println(names[i]);	
			//}
			 if(names[i].startsWith("A")) {
				System.out.println(names[i]);
			 }
			// if(names[i].endsWith("i")) {
				//	System.out.println(names[i]);
			 }
		
	}

}
