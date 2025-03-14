package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaC {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList();
		l.add(10);
		l.add(8);
		l.add(2);
		l.add(5);
		l.add(7);
		
		Comparator<Integer>c=(o1,o2)->((o1>o2)?1:(o1<o2)?-1:0);
		Collections.sort(l,c);
		System.out.println(l);
	}

}
