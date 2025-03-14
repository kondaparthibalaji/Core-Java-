package com.demo;

public class Method {
	int employeId=5;
	String employeName="Balu";
	
	static int companyId=111;
	static String companyName="Vcube";

	public static void main(String[] args) {
	Method A=new Method();
	A.employeId=1;
	A.employeName="kiran";
	int companyId=222;
	String companyName="V";
	System.out.println(A.employeId);
	System.out.println(A.employeName);
	System.out.println(companyId);
	System.out.println(companyName);
	
	

	}

}
