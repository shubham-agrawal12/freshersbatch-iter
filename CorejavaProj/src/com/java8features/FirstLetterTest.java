package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FirstLetterTest {

	public static void main(String[] args) {
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("shubham");
		arraylist.add("arko");
		arraylist.add("bharat");
	StringBuilder sb=new StringBuilder();
	
		Consumer<Character> consumer=(Char)->sb.append(Char);
		
		for(int i=0;i<arraylist.size();i++)
		{
			consumer.accept(arraylist.get(i).charAt(0));
		}
		System.out.println(sb.toString());
		
		
	}

}
