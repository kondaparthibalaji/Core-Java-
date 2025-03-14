package com.collectionframeworks;

import java.util.Stack;

public class Testcollectionsstack {

	public static void main(String[] args) {
		Stack<String>flowers=new Stack<>();
		flowers.push("yellow rose");
		flowers.push("jasmine");
		flowers.push("lotus");
		flowers.push("lilly");
		flowers.push("white rose");

		//System.out.println(flowers);
		//System.out.println(flowers.peek());
		//System.out.println(flowers.pop());
		System.out.println(flowers.peek());
		System.out.println(flowers.search("yellow rose"));
		System.out.println(flowers);
	}

}
