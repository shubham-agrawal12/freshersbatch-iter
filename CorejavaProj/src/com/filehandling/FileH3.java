package com.filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileH3 {

	public static void main(String[] args) throws Exception {
		
		File file=new File("C:\\Users\\hp\\Desktop\\shubhjava/accountdata.txt");
		FileOutputStream fos=new FileOutputStream(file);
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeInt(1);
		dos.writeUTF("arko");
		dos.writeDouble(5000.0);
		dos.writeInt(2);
		dos.writeUTF("shubham");
		dos.writeDouble(6000.0);
		dos.writeInt(3);
		dos.writeUTF("bharat");
		dos.writeDouble(6000.0);
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream(file);
		DataInputStream dis=new DataInputStream(fis);
		int id=dis.readInt();
		String name=dis.readUTF();
		double salary=dis.readDouble();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		id=dis.readInt();
		name=dis.readUTF();
		salary=dis.readDouble();
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		id=dis.readInt();
		name=dis.readUTF();
		salary=dis.readDouble();
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		dis.close();
		fis.close();
	
		

	}

}
