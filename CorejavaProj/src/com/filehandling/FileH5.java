package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Date implements Serializable
{
	int day;
	int month;
	int year;
	private static final long serialVersionUID=2L;
	public Date(int day,int month,int year)
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
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}




public class FileH5 {

	public static void main(String[] args) throws Exception {
		
		File file=new File("C:\\Users\\hp\\Desktop\\shubhjava/accountdata.txt");
		FileOutputStream fout=new FileOutputStream(file);
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(new Date(1,10,2020));
		out.flush();
		out.close();
		
		
		FileInputStream fin=new FileInputStream(file);
		ObjectInputStream in=new ObjectInputStream(fin);
		Date acc=(Date)in.readObject();
		System.out.println(""+acc);
		
		
		
	}

}
