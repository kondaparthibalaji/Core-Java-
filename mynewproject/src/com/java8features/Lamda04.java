package com.java8features;

interface Interf3{
	int squareit(int a);
	
}

//class Sathyam implements Interf3{
//	public int squareit(int a) {
//		return a*a;
//	}
//}
public class Lamda04 {

	public static void main(String[] args) {
		Interf3 i=(a)->
		{
			return a*a;		
		};
		int i1=i.squareit(5);
		System.out.println(i1);
	}

}
