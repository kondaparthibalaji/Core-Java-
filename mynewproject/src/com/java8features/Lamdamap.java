package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lamdamap {

	public static void main(String[] args) {
		List<Integer>m=new ArrayList<>();
		m.add(100);
		m.add(400);
		m.add(200);
		m.add(300);
		m.add(800);
		m.add(900);
		
		List<Integer>m1=m.stream().map(a->a+50)
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(m);
		System.out.println(m1);
	}

}
