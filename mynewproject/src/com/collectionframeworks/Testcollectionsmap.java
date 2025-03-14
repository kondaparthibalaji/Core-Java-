package com.collectionframeworks;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Testcollectionsmap {

	public static void main(String[] args) {
		
	 NavigableSet<Integer> n=new TreeSet<>();
     n.add(100);
     n.add(200);
     n.add(300);
     n.add(400);
     n.add(500);
     n.add(700);
     n.add(800);
     
    // System.out.println(n);
    // System.out.println(n.ceiling(500));
     //System.out.println(n.floor(400));
     System.out.println(n.higher(500));
     System.out.println(n.lower(400));
	 

	}

}
