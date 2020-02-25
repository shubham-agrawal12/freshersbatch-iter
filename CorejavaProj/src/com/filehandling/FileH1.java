package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileH1 {

	public static void main(String[] args)throws Exception	
	{
	
		File file=new File("C:\\Users\\hp\\Desktop\\shubhjava/abc.txt");
		FileInputStream f1=new FileInputStream(file);
		StringBuilder sb=new StringBuilder("");
		int i=0;
		do {
			i=f1.read();
			if(i!=-1)
			{
				sb.append((char)i);			}
		}
		while(i!=-1);
		System.out.println(sb);
		
		File file1=new File("C:\\Users\\hp\\Desktop\\shubhjava/abcd.txt");
		FileOutputStream fos=new FileOutputStream(file1);
		String str=sb.toString();
		fos.write(str.getBytes());
		fos.flush();
		fos.close();
		
		

	}

}
