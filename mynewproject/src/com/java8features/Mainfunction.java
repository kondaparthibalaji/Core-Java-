package com.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

class Student1{
	int marks;
	String name;
	
	public Student1(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}	
}

public class Mainfunction {

	public static void main(String[] args) {
		Predicate<Student1>p1=s->s.marks>40;
		
		Function<Student1,String>f=s->{
			int marks=s.marks;
			String grade=" ";
			
			if(marks>=80) {
				return "A";
			}else if(marks>=60) {
				return "B";
			}else if(marks>=40) {
				return "C";
			}else if(marks>=30) {
				return "D";
			}else {
				return "Failed";
			}
		};
		
		Student1[]s= {
				new Student1(98,"balaji"),
				new Student1(75,"varun"),
				new Student1(40,"kiran"),
				new Student1(33,"saii"),
				new Student1(25,"rakesh"),
			};
			for(Student1 s1:s) {
				if(p1.test(s1)) {
				System.out.println("Student marks:"+s1.marks);
				System.out.println("Student name:"+s1.name);
				System.out.println(f.apply(s1));
				System.out.println();
				}
			}

	}

}
