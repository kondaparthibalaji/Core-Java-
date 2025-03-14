package com.oops;

public class Teststudent {

	public static void main(String[] args) {
		
		Student s=new Student();
		Student s1=new Student();

		
		s.setStdid(101);
		s.setStdname("balu");
		s.setStdsalary(15000.00);
		
		s1.setStdid(102);
		s1.setStdname("RANA");
		s1.setStdsalary(14000.00);
		
		System.out.println(s.getStdid());
		System.out.println(s.getStdname());
		System.out.println(s.getStdsalary());
		System.out.println();
		System.out.println(s1.getStdid());
		System.out.println(s1.getStdname());
		System.out.println(s1.getStdsalary());

		
	}

}
