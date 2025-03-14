package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collection;

public class Testdemocollections {

	public static void main(String[] args) {
		Collection<String>boys=new ArrayList<>();
		boys.add("balu");
		boys.add("rana");
		boys.add("akhil");
		boys.add("kiran");
		System.out.println(boys);
		
		Collection<String>girls=new ArrayList<>();
		girls.add("Akhi");
		girls.add("Aishu");
		girls.add("Shravs");
		girls.add("yellow Rose");
		System.out.println(girls);
		
		Collection<String>BFS=new ArrayList<>();
		boys.clear();
		girls.clear();
		BFS.addAll(boys);
		BFS.addAll(girls);
		System.out.println(BFS);
		

	}

}
