package com.collectionframeworks;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Collections07 {

	public static void main(String[] args) {
		Vector<String>prabhas=new Vector();
		prabhas.addElement("salaar");
		prabhas.addElement("kalki");
		prabhas.addElement("rebel");
		prabhas.addElement("mirchi");
		prabhas.addElement("munna");
		prabhas.addElement("darling");
		prabhas.addElement("bahubali");

		prabhas.remove("bahubali");
		Iterator<String>itr=prabhas.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		ListIterator<String>litr=prabhas.listIterator();
//		while(litr.hasNext()) {
//			System.out.println(litr.next());
//		}
//		System.out.println("-------------------------------------");
//		while(litr.hasPrevious()) {
//			System.out.println(litr.previous());
//		}
//		Enumeration<String>e=prabhas.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
	//	System.out.println(prabhas);

	}

}
