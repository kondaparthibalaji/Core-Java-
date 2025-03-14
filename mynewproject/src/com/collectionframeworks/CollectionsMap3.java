package com.collectionframeworks;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMap3 {

	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap();
		m.put(101,"balaji");
		m.put(103," varun");
			System.out.println(m.put(101, "sathyam"));
			System.out.println(m.put(104, "mamatha"));

		System.out.println(m);
		
	}
}
