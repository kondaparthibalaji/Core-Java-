package com.java8features;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FnConsumer {

	public static void main(String[] args) {
		Consumer<String>c=(s)->{
			System.out.println(s);
			System.out.println(s.length());
		};
			c.accept("balajichary");
			
		Supplier s=()->new Date();
		System.out.println(s.get());
		
		Supplier<String>s1=()->{
			String otp="";
		 for(int i=0;i<6;i++) {
			 otp=otp+(int)(Math.random()*10);
		 }
		 return otp;
		};
		 System.out.println(s1.get());	
	}

}
