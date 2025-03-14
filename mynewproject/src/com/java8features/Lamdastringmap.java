package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lamdastringmap {

	public static void main(String[] args) {
		List<String>s=new ArrayList<>();
		s.add("varun");
		s.add("akhil");
		s.add("uday");
		s.add("rakesh");
		s.add("tinku");
		
		//List<String>s1=s.stream()
		//		.map(a->String (Startswith(a))
		//				.collect(Collectors.toList());
		
		System.out.println(s);
		//System.out.println(s1);
	}

}
