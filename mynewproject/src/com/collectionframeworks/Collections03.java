package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collection;

public class Collections03 {

	public static void main(String[] args) {
		Collection<String>fruits=new ArrayList<>();
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("pineapple");
		
		System.out.println(fruits.hashCode());
		
		Collection<String>veggies=new ArrayList<>();
		veggies.add("bendi");
		veggies.add("beans");
		veggies.add("tomato");
		veggies.add("potato");
		veggies.add("banana");
		
		if(veggies.isEmpty()) {
			System.out.println("its true");
		}else {
			System.out.println("its false");
		}
		
		if(fruits.equals(veggies)) {
			System.out.println("yes we find");
		}else {
			System.out.println("no we dont find");
		}
	}

}
