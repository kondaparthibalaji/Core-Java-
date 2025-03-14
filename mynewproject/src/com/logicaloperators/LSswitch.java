package com.logicaloperators;

import java.util.Scanner;

public class LSswitch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter your age");
	int age =sc.nextInt();
	String agedescription;
	switch(age){
	
	case(8):
		agedescription="child";
	break;
	case(15):
		agedescription="teen age";
	break;
	case(18):
		agedescription="young age";
	break;
	default:
		agedescription="old age";
	break;
	}
	System.out.println(agedescription);
	}

}
