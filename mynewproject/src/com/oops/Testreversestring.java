package com.oops;

public class Testreversestring {

	public static void main(String[] args) {
		String s="balaji";
		String ans="";
		String []s1=s.split("");
		for(int i=s1.length-1;i>=0;i--) {
			ans=ans+s1[i]+" ";
		}System.out.println(ans);
	}

}
