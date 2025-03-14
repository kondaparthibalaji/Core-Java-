package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lamdacomparator {

	public static void main(String[] args) {
		List<Integer> b=new ArrayList<>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		
		List<Integer>b1=b.stream().sorted((i1,i2)->(i1<i2)?-1:(i1>i2)?1:0)
				.collect(Collectors.toList());
		
		System.out.println(b);
		System.out.println(b1);
	}

}
