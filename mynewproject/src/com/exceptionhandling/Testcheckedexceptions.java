package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class Testcheckedexceptions {

	public static void main(String[] args) {
		File f=new File("D:\\JAVA PROGRAM FILES\\balaji.txt");
		System.out.println("code started");
		try {
		f.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("code ended");
}
}
