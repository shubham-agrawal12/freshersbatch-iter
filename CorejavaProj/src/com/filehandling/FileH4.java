package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class FileH4 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis1=new FileInputStream("C:\\Users\\hp\\Desktop\\shubhjava/abc.txt");
		FileInputStream fis2=new FileInputStream("C:\\Users\\hp\\Desktop\\shubhjava/abcd.txt");
		FileInputStream fis3=new FileInputStream("C:\\Users\\hp\\Desktop\\shubhjava/accountdata.txt");
		
		Vector v=new Vector();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		Enumeration e=v.elements();
		SequenceInputStream sis=new SequenceInputStream(e);
		int i;
		while((i=sis.read())!=-1)
		{
			
			System.out.print((char)i);
		}
		sis.close();
		fis1.close();
		fis2.close();
		fis3.close();
		

	}

}
