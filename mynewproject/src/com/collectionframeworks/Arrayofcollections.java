package com.collectionframeworks;

import java.util.ArrayList;
import java.util.List;

public class Arrayofcollections {

	public static void main(String[] args) {
		List<Integer>ages=new ArrayList<>();
		ages.add(20);
		ages.add(21);
		ages.add(22);
		ages.add(23);
		
		//ages.remove(ages.indexOf(20));
		//ages.set(0,20);
		//ages.set(1, 21);
		//ages.set(2, 22);
		//ages.toArray();
		System.out.println(ages);
	}
}	
