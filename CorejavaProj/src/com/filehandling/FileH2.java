package com.filehandling;

import java.io.File;
import java.text.SimpleDateFormat;
public class FileH2 {

	public static void main(String[] args) {
		
		
		File dir=new File("C:\\Users\\hp\\Desktop\\shubhjava\\New folder");
		SimpleDateFormat sdf=new SimpleDateFormat();
		File[] str1=dir.listFiles();
		
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(" date="+sdf.format(str1[i].lastModified())+"  length="+str1[i].length()+"  readable="+str1[i].canRead()+"  name="+str1[i].getName());
		}
		
		

	}

}
