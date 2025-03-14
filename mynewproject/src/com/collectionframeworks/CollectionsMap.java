package com.collectionframeworks;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public class CollectionsMap {

	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap();
		m.put(101," balaji");
		m.put(103," varun");
		m.put(105," rana");
		m.put(102," rakesh");
		m.put(104," sai");
		m.put(106," kiran");
		
		Set<Integer>s=m.keySet();
		System.out.println(s);
		Collection<String>t=m.values();
		System.out.println(t);
		
		Set<Entry<Integer,String>>entries=m.entrySet();
		for(Entry<Integer,String>entry:entries) {
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
	}

}
