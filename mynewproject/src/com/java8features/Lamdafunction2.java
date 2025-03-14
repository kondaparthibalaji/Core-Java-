package com.java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	int marks;
	String names;
	public  Student(String names,int marks) {
		this.marks=marks;
		this.names=names;
	}

}

public class Lamdafunction2 {
	
	public static void main(String[] args) {
		Predicate<Student>p=s->s.marks>60;
		
		Function<Student,String>f= s->{
		int marks=s.marks;
		String grade="";
		if(marks>=80) 
			grade="A";
		else if(marks>=60)
			grade="B";
		else if(marks>=40)
			grade="c";
		else if(marks>=30)
			grade="d";
		else 
			grade="failed";
			return grade;
		};	
		Consumer<Student>c=s->{
			System.out.println("Student name="+s.names);
			System.out.println("Student marks="+s.marks);
			System.out.println("student grade="+f.apply(s));	
		};

		Student[] s= 
				{
				new Student ("balu",85),
				new Student("varun",65),
				new Student ("kiran",45),
				new Student ("rana",30),
				new Student ("rakhi",25)
				};
			for(Student s1:s) {
				if(p.test(s1)) { 
					c.accept(s1);
				System.out.println();
				}
				
			}
			

		

	}

}
