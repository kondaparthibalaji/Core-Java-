package com.oops;

public class TestAnagram {

	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		int count=0;
		char[]ch1=s1.toCharArray();
		char[]ch2=s2.toCharArray();
		for(int i=0;i<s1.length();i++) {
		
			for(int j=0;j<s2.length();i++) {
				if(ch1[i]==ch2[j]) {
					count=count+1;
				}
			}
		}if(count==s1.length()) {
			System.out.println("its a anagram");
		}else {
			System.out.println("its not a anagram");
		}
	}

}
