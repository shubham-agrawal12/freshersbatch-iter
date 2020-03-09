package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsList {
	
	Object elem;
	
	
		

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		
		printList(list);
	}
	
		public static void printList(List<? extends Number>list)
		{
			for(Number n:list)
			{
				System.out.println(n);
			}
			
			
			
	}

}
