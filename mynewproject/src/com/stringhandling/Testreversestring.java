package com.stringhandling;

import java.util.Scanner;

public class Testreversestring {

	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("please enter a string:");
     String str=sc.nextLine();
     String rstr="";
     
     for (int i=0;i<str.length();i++) {
    	 char c= str.charAt(i);
    	 rstr=c+rstr;
     }
     	System.out.println("The given String is :"+str);
     	System.out.println("The riverse String is :"+rstr);
     	
     	if(str.equalsIgnoreCase(rstr)) {
     		System.out.println("The given string is palindrome");
     	}else {
     		System.out.println("The given string is not a palindrome");
     	}
    	 
	}

}
