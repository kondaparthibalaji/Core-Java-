package com.oops;

import java.util.Scanner;

public class PersonalLoan {

	public static void main(String[] args) {
		PersonalLoan p=new PersonalLoan();
		int cibil=p.getcibilscore();
		double salary=p.getsalary();
		if(cibil>=600&&salary>=50000.00) {
			System.out.println("you are eligible for personalloan");
			System.out.println("rate of interest;"+p.getroi());
			System.out.println("getaddress details ;" +p.getaddressdetails());
		}else {
			System.out.println("sorry u r not eligible");
		}
		
			
	}
		
		int getcibilscore() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your cibilscore;");
			int cibil=sc.nextInt();
			return cibil;	
		}
		double getsalary() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your salary;");
			int salary=sc.nextInt();
			return salary;
		}
		double getroi() {
			double roi=10.5;
			return roi;
		}
		String getaddressdetails() {
			String details=("balaji,kphb,hyderabad");
			return details;
		}

}
