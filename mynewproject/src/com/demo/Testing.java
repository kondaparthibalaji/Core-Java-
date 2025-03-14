package com.demo;

public class Testing {
	int id;
	String name;
	long MobileNum;
 void dispaly() {
	System.out.println("inheritance executed");
}
}

 class Section extends Testing{
	public static void main(String[] args) {
		
		Section t=new Section();
		t.id=9923;
		t.name="Balu";
		t.MobileNum=9876468339L;

		System.out.println(t.id);
		System.out.println(t.name);
		System.out.println(t.MobileNum);
		t.dispaly();
		}
 }

