package com.java8features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lamdaloop {

	public static void main(String[] args) {
		List<String>names=Arrays.asList("balaji","varun","rakesh","raju","ajay");
	//	names.forEach(name->System.out.println(name));
		names.forEach(System.out::println);
		
		Map<Integer,String>values=new HashMap();
		values.put(1, "sathyam");
		values.put(2, "ramesh");
		values.put(3, "sadhanandam");
		values.put(4, "swarupa");

		//values.forEach((a,b)->System.out.println(a+"-"+b));
		
		values.entrySet().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));

	}

}
