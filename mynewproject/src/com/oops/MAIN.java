package com.oops;

public class MAIN {

	public static void main(String[] args) {
		ANIMAL c=new Cheetah();
		System.out.println(c.makesound());
		System.out.println(c.hunting());
		System.out.println(c.running());
		c.method1();
		ANIMAL.method2();
		
		ANIMAL a=new Lion();
		a.method1();
		Lion.method2();
		
	}

}
