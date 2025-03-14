package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lamdastream {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(33);
		l.add(60);
		l.add(57);
		l.add(90);
		l.add(81);
		
		List<Integer>ls=l.stream().filter(a->a%2==0).collect(Collectors.toList());
		List<Integer>la=l.stream().filter(a->a%2!=0).collect(Collectors.toList());

		System.out.println(l);
		System.out.println(ls);
		System.out.println(la);


	}

}
