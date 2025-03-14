package com.java8features;

@FunctionalInterface
interface Interf2 {
	abstract String addition(String a,int b);
	 default void subtraction(int c,int d) {
		 System.out.println(c-d);
		 
	 }
}
//class Varun implements Interf2{
//	public void addition(int a,int b) {
//		System.out.println(a+b);
//	}
//}
public class Lamda2 {

	public static void main(String[] args) {
		Interf2 i=(a,b)->
		{ 
			String s=a+b;
			System.out.println(s);
			return s;
		};
		i.addition("varun",10);
		
		i.subtraction(5,2);
	}
	
		

}
