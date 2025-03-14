package com.collectionframeworks;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Testcollectionsset {

	public static void main(String[] args) {
		SortedSet<String>babes=new TreeSet<>();
		babes.add("Kiwi");
		babes.add("Spicy");
		babes.add("Cherry");
		babes.add("Buggalu");
		babes.add("Lilly");
		
		System.out.println(babes);
		// Buggalu,Cherry,Kiwi,Lilly,Spicy,
		System.out.println(babes.first());
		System.out.println(babes.last());
		System.out.println(babes.headSet("Kiwi"));
		System.out.println(babes.tailSet("Kiwi"));
		System.out.println(babes.subSet("Cherry","Spicy"));
	}

}
