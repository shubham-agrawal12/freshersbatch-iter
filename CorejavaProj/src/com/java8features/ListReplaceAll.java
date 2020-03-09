package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListReplaceAll {

	public static void main(String[] args) {
		
			List<String> arraylist=new ArrayList<String>();
			arraylist.add("shubham");
			arraylist.add("arko");
			arraylist.add("bharat");
			arraylist.add("ananta");
			UnaryOperator<String> uppercase=(String)->String.toUpperCase();
			arraylist.replaceAll(uppercase);
			for(int i=0;i<arraylist.size();i++)
			{
				System.out.println(arraylist.get(i));
			}
			
	}

}
