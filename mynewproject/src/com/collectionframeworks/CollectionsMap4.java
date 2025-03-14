package com.collectionframeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CollectionsMap4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the word;");
		String str=sc.nextLine();
		
		Map<Character,Integer>map=new HashMap();
		
		char []chars=str.toCharArray();
		for(char c:chars) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		Set<Entry<Character,Integer>>entries=map.entrySet();
		for(Map.Entry<Character,Integer> e:entries) {
		System.out.println(e.getKey()+"--->"+e.getValue());
		}
	}

}
