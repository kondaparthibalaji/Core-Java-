package com.java8features;

import java.util.function.Function;

public class Lamdafunction {

	public static void main(String[] args) {
		//Function<String,Integer> f=str->str.length();
		//System.out.println(f.apply("balajichary"));
		
		//Function<Integer,Integer> f1=st-> st*st;
		//System.out.println(f1.apply(10));
 
		//Function<Integer,Double> f2=s->s/2.0;
		//System.out.println(f2.apply(50));

		//Function<String,String> f3=ss->ss.toLowerCase();
		//System.out.println(f3.apply("varun-chary"));
		
		//Function<Integer,Integer>f=i->3*i;
		//Function<Integer,Integer>f1=i->i*i*i;
		
		//System.out.println(f.andThen(f1).apply(2));
		//System.out.println(f.compose(f1).apply(2));
		
		Function<String,Integer>f=a->a.length();
		System.out.println(f.apply("balaji"));
		
		Function<Integer,Integer>f1=a->a*a;
		System.out.println(f1.apply(7));
		
		Function<Integer,Double>f2=a->a/2.0;
		System.out.println(f2.apply(23));
		
		Function<String,String>f3=a->a.toLowerCase();
		System.out.println(f3.apply("BALAJI"));
		
		Function<Integer,Integer>f4=a->2*a;
		Function<Integer,Integer>f5=a->a*a*a;
		
		System.out.println(f4.andThen(f5).apply(2));
		System.out.println(f4.compose(f5).apply(3));
	}

}
