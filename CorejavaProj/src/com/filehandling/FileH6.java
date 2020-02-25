package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class FileH6 {
	private File file=new File("C:\\Users\\hp\\Desktop\\shubhjava/accountdata.dat");
	int id;
	String name;
	double salary;
	void create() throws Exception
	{	
	RandomAccessFile raf=new RandomAccessFile(file,"rw");
	raf.writeInt(1);
	raf.writeUTF("shubham");
	raf.writeDouble(5000.0);
	raf.writeInt(2);
	raf.writeUTF("bharat");
	raf.writeDouble(6000.0);
	raf.writeInt(3);
	raf.writeUTF("anant");
	raf.writeDouble(7000.0);
	raf.close();
	}
	void read() throws Exception
	{
	RandomAccessFile raf=new RandomAccessFile(file,"r");	
	id=raf.readInt();
	name=raf.readUTF();
	salary=raf.readDouble();
	System.out.println("ID="+id+"  Name="+name+" Salary="+salary);
	id=raf.readInt();
	name=raf.readUTF();
	salary=raf.readDouble();
	System.out.println("ID="+id+"  Name="+name+" Salary="+salary);
	id=raf.readInt();
	name=raf.readUTF();
	salary=raf.readDouble();
	System.out.println("ID="+id+"  Name="+name+" Salary="+salary);
	raf.close();
	}
	void update() throws Exception
	{
		//read();
		System.out.println("after update");
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		/*
		id=raf.readInt();
		name=raf.readUTF();
		salary=raf.readDouble();
		id=raf.readInt();
		name=raf.readUTF();
		salary=raf.readDouble();
		id=raf.readInt();
		name=raf.readUTF();
		salary=raf.readDouble();
		*/
		
		long CurrentPosition=raf.getFilePointer();
		raf.seek(4);
		raf.writeUTF("arko");
		raf.writeDouble(100000);
		CurrentPosition=raf.getFilePointer();
		System.out.println("CurrentPosition of pointer="+CurrentPosition);
		raf.seek(CurrentPosition+4);
		raf.writeUTF("piyush");
		raf.writeDouble(789000);
		raf.close();
	}
	void delete()throws Exception
	{
		System.out.println("after Delete");
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		raf.writeInt(0);
		raf.writeUTF("");
		raf.writeDouble(0);
		raf.writeInt(0);
		raf.writeUTF("");
		raf.writeDouble(0);
		raf.writeInt(0);
		raf.writeUTF("");
		raf.writeDouble(0);
		raf.close();
	}
	void checkBalance()
	{
		
	}
	public static void main(String[] args) throws Exception {
		
		FileH6 f1=new FileH6();
		f1.create();
		//f1.read();
		f1.update();
		f1.read();
		f1.delete();
		f1.read();
		
	
		
	}
		
	

}
