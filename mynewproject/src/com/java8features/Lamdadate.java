package com.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Lamdadate {

	public static void main(String[] args) {
		
//		LocalDate date= LocalDate.now();
//		System.out.println(date);
//		int day=date.getDayOfMonth();
//		int month=date.getMonthValue();
//		int year=date.getYear();
//		
//		System.out.printf("%d/%d/%d",day,month,year);

//		LocalTime time= LocalTime.now();
//		System.out.println(time);
//		
//		int hour=time.getHour();
//		int min=time.getMinute();
//		int sec=time.getSecond();
//		int nan=time.getNano();
//		
//		System.out.printf("%d:%d:%d:%d",hour,min,sec,nan);

		
		LocalDateTime datetime= LocalDateTime.now();
		System.out.println(datetime);
		int day=datetime.getDayOfMonth();
		int month=datetime.getMonthValue();
		int year=datetime.getYear();
		int hour=datetime.getHour();
		int min=datetime.getMinute();
		int sec=datetime.getSecond();
		int nan=datetime.getNano();
		
		System.out.printf("%d:%d:%d:%d:%d:%d:%d",day,month,year,hour,min,sec,nan);

		

	}

}
