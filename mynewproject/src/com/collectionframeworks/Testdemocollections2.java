package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.List;

public class Testdemocollections2 {

	public static void main(String[] args) {
		Collection<String>boys=new ArrayList<>();
		boys.add("balu");
		boys.add("kiran");
		boys.add("rana");
		boys.add("kumar");
		//boys.remove("balu");
		//boys.hashCode();
		//System.out.println(boys.hashCode());
		System.out.println(boys.hashCode());
		
		Collection<String>girls=new ArrayList<>();
		girls.add("kumar");
		girls.add("rana");
		girls.add("kiran");
		girls.add("balu");
		System.out.println(girls.hashCode());
		//if(boys.equals(girls))
		 //System.out.println("yes");
		//else
			//System.out.println("NO");
		

	}

}
