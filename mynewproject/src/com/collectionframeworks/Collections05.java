package com.collectionframeworks;

import java.util.ArrayList;
import java.util.List;

public class Collections05 {

	public static void main(String[] args) {
		List<Object>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(0,10);
		l.add(1,20);
		l.add("balu");
		
		//l.removeAll(l);
		System.out.println(l.get(6));
		System.out.println(l.indexOf(10));
		System.out.println(l.lastIndexOf(10));


		if(l.contains(40)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		System.out.println(l);
		
		
	}

}
