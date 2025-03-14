package com.collectionframeworks;

import java.util.ArrayList;
import java.util.List;

public class Collections06 {

	public static void main(String[] args) {
		List<Object>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add("balu");
		//l.add(1,22);
		//l.remove(l.indexOf(10));
		l.set(1,25);
			System.out.println(l);
		Object[]arr=l.toArray();
		for(Object a:arr) {
			System.out.println(a);
		}
	}

}
