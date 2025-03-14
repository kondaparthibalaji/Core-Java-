package com.java8features;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaBI {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer>p=(i,j)->(i+j)%2==0;
		System.out.println(p.test(20,20));
		
		BiFunction<String,String,Integer>f=(s1,s2)->(s1.length()+s2.length());
		System.out.println(f.apply("balu","varun"));

		Consumer<String> c=c1->{
			System.out.println(c1);
			System.out.println(c1.length());
		};
			c.accept("saaho");
	}

}
