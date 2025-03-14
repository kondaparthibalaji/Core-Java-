package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Collections02 {

	public static void main(String[] args) {
		Collection<String>boys=new ArrayList<>();
		boys.add("balaji");
		boys.add("kiran");
		boys.add("rana");
		boys.add("rakhi");
		boys.add("sai");
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("please enter the name;");
		//String s=sc.next();
		if(boys.contains("sai")) {
			System.out.println("yes we find it");
		}else {
			System.out.println("sry we dont find it");
		}
		
	}

}
