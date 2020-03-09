package com.mytestjavafiles;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

public class DateTest1 {

	public static void main(String[] args) {
		//fifteenDays();
		getZone();

	}
	public static void fifteenDays()
	{
		LocalDate localdate=LocalDate.now();
		System.out.println(localdate);
		Period p=Period.ofDays(15);
		localdate=localdate.plus(p);
		System.out.println(localdate);
		System.out.println(localdate.getDayOfMonth() + "/" + localdate.getMonth().getValue() + "/" + localdate.getYear());
		int year=localdate.get(ChronoField.YEAR);
		System.out.println(year);
		int month=localdate.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month);
		int day=localdate.get(ChronoField.DAY_OF_MONTH);
		System.out.println(day);
		
	}
	public static void getTime()
	{
		LocalTime localtime=LocalTime.now();
		System.out.println(localtime);
		int hour=localtime.getHour();
		System.out.println(hour);
		int min=localtime.getMinute();
		System.out.println(min);
		int sec=localtime.getSecond();
		System.out.println(sec);
		LocalTime localtime1=LocalTime.of(23, 00, 00);
		Duration d1=Duration.between(localtime1, localtime);
		d1=d1.plusHours(12);
		System.out.println(d1);
		
	}
	public static void getZone()
	{
		LocalTime localtime=LocalTime.now();
		System.out.println("india--"+localtime);
		ZoneId rome=ZoneId.of("Europe/Rome");
		localtime=localtime.now(rome);
		System.out.println("rome--"+localtime);
	}

}
