package com.java8features;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

import static java.time.temporal.TemporalAdjusters.*;

public class DateTest {

	public static void main(String[] args) {
		//fifteenDays();
		//getTime();
		//getFeb();
		//getZone();
		//getDateLocale();
		//getDateFormat();
		getSunday();
	}
		public static void fifteenDays() {
		LocalDate localdate=LocalDate.now();
		System.out.println(localdate);
		Period fifteendays=Period.ofDays(15);
		localdate=localdate.plus(fifteendays);
		System.out.println(localdate);

	}
		public static void getTime()
		{
			LocalTime localTime=LocalTime.now();
			LocalDate localdate=LocalDate.now();
			int day=localdate.get(ChronoField.DAY_OF_MONTH);
			//System.out.println(day);
			LocalTime localTime1=LocalTime.of(23, 00, 00);
			Duration d1=Duration.between(localTime, localTime1);
			Duration t2=d1.plusHours(12);
			System.out.println(t2);
			
		}
		public static void getFeb()
		{
			
			LocalDate localdate=LocalDate.now();
			LocalDate with1 = localdate.with(TemporalAdjusters.lastDayOfMonth());
			System.out.println(with1);
			if(with1.isLeapYear()==true)
			{
				
			}
			
			
			
			
		}
		public static void getZone()
		{
			LocalTime localTime1=LocalTime.now();
			System.out.println("India local time="+localTime1);
			ZoneId rome=ZoneId.of("Europe/Rome");
			LocalTime localtime=LocalTime.now(rome);
			System.out.println("Rome local time="+localtime);
			ZoneId los=ZoneId.of("America/Los_Angeles");
			LocalTime localtime2=LocalTime.now(los);
			System.out.println("Los_Angeles local time="+localtime2);
		}
		public static void getDateLocale()
		{
			DateTimeFormatter itilianFormat=DateTimeFormatter.ofPattern("d. MMMM yyyy",Locale.ITALIAN);
			LocalDate d1=LocalDate.now();
			String formatdate=d1.format(itilianFormat);
			System.out.println(formatdate);
			DateTimeFormatter koreanFormat=DateTimeFormatter.ofPattern("d. MMMM yyyy",Locale.JAPANESE);
			LocalDate d2=LocalDate.now();
			String formatdate1=d2.format(koreanFormat);
			System.out.println(formatdate1);
			
		}
		public static void getDateFormat()
		{
			DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
			LocalDate d2=LocalDate.of(2016,9,25);
			System.out.println(d2);
			String formatdate=d2.format(format);
			String formatdate2=d2.format(format1);
			System.out.println(formatdate);
			System.out.println(formatdate2);
		}
		public static void getSunday()
		{
			int count=1;
			LocalDate localdate=LocalDate.now();
			LocalDate with1=localdate.with(firstDayOfYear());
			LocalDate i=with1;
			while(i.isBefore(localdate.with(lastDayOfYear())))
			{
				if(i.getDayOfWeek().toString()=="SUNDAY")
				{
					System.out.println(i);
					count++;
				}
				i=i.plusDays(1);
			}
			System.out.println(count);
		}
		

}
