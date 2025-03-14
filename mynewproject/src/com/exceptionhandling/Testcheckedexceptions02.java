package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Testcheckedexceptions02 {

	public static void main(String[] args){
		try {
		FileReader fr=new FileReader("D:\\JAVA PROGRAM FILES\\balaji.txt");
		try {
		int n=fr.read();
		
		 while(n!=-1) {
			 System.out.print((char)n);
			 try {
			 Thread.sleep(100);
			 }catch(InterruptedException ie) {
				 ie.printStackTrace();
			 }
			 n=fr.read();
		 }
		}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
		System.out.println("code ended");
		
		}
}
