package com.collectionframeworks;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Collections09 {

	public static void main(String[] args) {
		NavigableSet<Object>n=new TreeSet();
		n.add(200);
		n.add(900);
		n.add(700);
		n.add(500);
		n.add(300);
		n.add(600);
//		n.add("balu");
//		n.add("kittu");
		//System.out.println(n.ceiling(800));
		//System.out.println(n.floor(100));
		System.out.println(n.higher(500));
		System.out.println(n.lower(300));
		System.out.println(n);


	}

}
