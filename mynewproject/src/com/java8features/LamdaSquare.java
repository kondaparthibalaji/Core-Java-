package com.java8features;

interface Interf10 {
	int Squareit(int a);
}

public class LamdaSquare {
	public static void main(String[] args) {
		Interf10 is=(a)->{
		return a*a;
		};
		int x=is.Squareit(10);
		System.out.println(x);

	}

}
