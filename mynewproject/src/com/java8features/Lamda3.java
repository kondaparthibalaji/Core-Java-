package com.java8features;

import java.util.function.Predicate;

public class Lamda3 {

	public static void main(String[] args) {
		
//		Predicate<Integer>p=a->a%2==0;
//		System.out.println(p.test(10));
//		
//		Predicate<String>p1=b->b.length()==5;
//		System.out.println(p1.test("varun"));
//		
//		
//		String []names={"balaji","rakesh","saikumar","ranadheer","kiran"};
//		Predicate<String>p2=s->s.length()>=5;
//		for(String name:names) {
//			if(p2.test(name)) {
//				System.out.println(name);
//			}
//		}
//		
		Predicate<Double>p3=sal->sal>100000;
		boolean status=p3.test(1500000.00);
		if(status=true) {
			System.out.println("u r eligible");
		}else {
			System.out.println("sorry");
		}
		
		
		
		

	}

}
