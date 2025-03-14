package com.constructors;

public class Testconstructor1 {
	
	int id;
	String name;

	public Testconstructor1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		Testconstructor1 t=new Testconstructor1(10,"balu");
		System.out.println(t.id+" "+t.name);
		Testconstructor1 t1=new Testconstructor1(11,"rakhi");
		System.out.println(t1.id+" "+t1.name);
		Testconstructor1 t2=new Testconstructor1(12,"kiwi");
		System.out.println(t2.id+" "+t2.name);
		Testconstructor1 t3=new Testconstructor1(13,"spicy");
		System.out.println(t3.id+" "+t3.name);

	}

}
