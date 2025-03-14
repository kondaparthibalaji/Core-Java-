package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collection;

public class Collections01 {

	public static void main(String[] args) {
		Collection<String>boys=new ArrayList<>();
		boys.add("balaji");
		boys.add("kiran");
		boys.add("rana");
		boys.add("rakhi");
		boys.add("sai");
		
		Collection<String>girls=new ArrayList<>();
		girls.add("jaya");
		girls.add("lilly");
		girls.add("anusha");
		girls.add("akhi");
		girls.add("soujanya");
		
		Collection<String>students=new ArrayList<>();
		//boys.clear();
		students.addAll(boys);
		students.addAll(girls);
		students.add("ramadasu");
		System.out.println(students);
		
		Collection<String>childs=new ArrayList<>();
		childs.add("nani");
		childs.add("ammu");
		if(students.containsAll(childs)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}



	}

}
