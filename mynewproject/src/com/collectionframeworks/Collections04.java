package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections04 {

	public static void main(String[] args) {
		Collection<String>fruits=new ArrayList<>();
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("pineapple");
		
		//fruits.removeAll(fruits);
		//System.out.println(fruits);
		Iterator<String>itr=fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				
		Collection<String>veggies=new ArrayList<>();
		veggies.add("bendi");
		veggies.add("beans");
		veggies.add("tomato");
		veggies.add("potato");
		veggies.add("banana");
		veggies.add("mango");
		
		fruits.retainAll(veggies);
		System.out.println(fruits);

	}

}
