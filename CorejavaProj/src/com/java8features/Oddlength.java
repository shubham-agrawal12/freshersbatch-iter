package com.java8features;

import java.util.ArrayList;
import java.util.List;

public class Oddlength {

	public static void main(String[] args) {
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("shubha");
		arraylist.add("arko");
		arraylist.add("bharat");
		arraylist.add("anant");
		arraylist.add("stuti");
		
		
		arraylist.removeIf(s->(s.length()%2==1));
		
		for(String i:arraylist)
		{
			System.out.println(i);
		}

	}

}
