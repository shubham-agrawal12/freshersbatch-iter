package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
	
	public static void testArrayList()
	{
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		ListIterator<String> itr=arrayList.listIterator();
		System.out.println("Forward dir");
		while(itr.hasNext())
		{
			String name=itr.next();
			System.out.println(name);
		}
		System.out.println("Reverse dir");
		while(itr.hasPrevious())
		{
			String name=itr.previous();
			System.out.println(name);
		}
		}

	public static void main(String[] args) {
		testArrayList();

	}

}
