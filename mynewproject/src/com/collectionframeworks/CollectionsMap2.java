package com.collectionframeworks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.WeakHashMap;

public class CollectionsMap2 {

	public static void main(String[] args) {
		Employee e=new Employee();
		WeakHashMap<Object,String>m=new WeakHashMap();
		m.put(e," balaji");
		System.out.println(m);
		
		e=null;
		System.gc();
		System.out.println(m);

	}

}
class Employee{

	@Override
	public String toString() {
		return "Employee ";
	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
	
}
