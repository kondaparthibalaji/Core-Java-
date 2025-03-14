 package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lamdastring {

	public static void main(String[] args) {
		
		List<String>s=new ArrayList();
		s.add("darling");
		s.add("munna");
		s.add("bujjigadu");
		s.add("saaho");
		s.add("bahubali");
		s.add("chakram");
		s.add("darling");
		s.add("bahubali");
		
		List<String>ss=s.stream()
				.filter(a->a.length()>5)
				.distinct()
				.sorted((s1,s2)->-s1.compareTo(s2))
				.collect(Collectors.toList());
		
		System.out.println(s);
		long count1=s.stream().count();
		System.out.println(ss);
		long count2=ss.stream().count();
		
		System.out.println(count1);
		System.out.println(count2);


	}

}
