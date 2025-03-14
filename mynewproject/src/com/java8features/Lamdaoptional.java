package com.java8features;

import java.util.Optional;

public class Lamdaoptional {

	public static void main(String[] args) {
	String[]str=new String[10];
	str[9]="kondaparthi balaji";
	Optional<String>isNull=Optional.ofNullable(str[9]);
	
	if(isNull.isPresent()) {
		String str2=str[9].substring(2,12);
		System.out.println(str2);
	}else {
		System.out.println("there is no any substring");
	}

}
}