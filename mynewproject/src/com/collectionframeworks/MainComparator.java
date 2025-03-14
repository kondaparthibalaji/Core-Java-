package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MainComparator {

	public static void main(String[] args) {
		Employe2 e=new Employe2(7,"akhila",15000.00);
		Employe2 e1=new Employe2(6,"jaya",10000.00);
		Employe2 e2=new Employe2(9,"suma",22000.00);
		Employe2 e3=new Employe2(8,"ashwini",24000.00);
				
				List<Employe2>l=new ArrayList();
				l.add(e);
				l.add(e1);
				l.add(e2);
				l.add(e3);
				
				Comparator<Employe2> c=new Comparator<>() {
					@Override
					public int compare(Employe2 o1,Employe2 o2) {
						if(o1.getId()>o2.getId()) {
							return -1;
						}else if(o1.getId()<o2.getId()) {
							return 1;
						}else {
							return 0;
						}
						
					}
					};
					
				Collections.sort(l,c);
				Iterator<Employe2>i=l.iterator();
				while(i.hasNext())
				System.out.println(i.next());

			}
	}


