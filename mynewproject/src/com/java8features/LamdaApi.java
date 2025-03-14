package com.java8features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LamdaApi {

	public static void main(String[] args) {
	//List<String>names=Arrays.asList("balu","mulugu","warangal","hnk");
	//names.forEach(name->System.out.println(name));
	//names.forEach(System.out::println);
	
	//List<Integer>numbers=Arrays.asList(7,3,8,9,4,6);
	//numbers.forEach(n->System.out.println(n));
	
	Map<Integer,String>values=new HashMap<>();
	values.put(1,"Balu");
	values.put(2,"Varun");
	values.put(3,"Sathyam");
	values.put(4,"Mamatha");
	
	values.forEach((a,b)->System.out.println(a+","+b));
//values.entrySet().forEach(entry->System.out.println(entry.getKey()+","+entry.getValue()));
	}

}
