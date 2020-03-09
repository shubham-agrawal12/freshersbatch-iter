package com.collections;

import java.util.HashMap;

class Date
{
	int day,month,year;
	Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}




public class EmployeeHashMap {
	
	
	public static void testHashmap()
	{
		Date d1=new Date(10,5,1998);
		Date d2=new Date(15,6,2000);
		Date d3=new Date(15,6,2000);
		HashMap<String,Date> ht=new HashMap<String,Date>();
		ht.put("shubham",d1);
		ht.put("arko",d2);
		ht.put("bharat",d3);
		System.out.println(ht);
	}
	

	public static void main(String[] args) {
		testHashmap();
		

	}

}
