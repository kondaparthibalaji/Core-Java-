package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainComparable {

	public static void main(String[] args) {
		Employe e=new Employe(1,"balaji",50000.00);
		Employe e1=new Employe(4,"rakesh",30000.00);
		Employe e2=new Employe(3,"kiran",20000.00);
		Employe e3=new Employe(2,"saikumar",40000.00);
		
		List<Employe>l=new ArrayList();
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		
		Collections.sort(l);
		Iterator<Employe>i=l.iterator();
		while(i.hasNext())
		System.out.println(i.next());


	}

}
