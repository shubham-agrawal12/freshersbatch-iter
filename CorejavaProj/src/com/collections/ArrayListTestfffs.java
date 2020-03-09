package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTestfffs implements Runnable {
	
	Thread t1,t2;
	static List<String> arraylist=new ArrayList<String>();
	public ArrayListTestfffs()
	{
		t1=new Thread(this);
		t2=new Thread(this);
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();
		
	}
	public static void main(String args[])
	{
	new ArrayListTestfffs();
	}
		
	
	
	public void run()
	{
		 Thread currentThread=Thread.currentThread();
		 if(currentThread.getName().equals("T1"))
		 {
			 arraylist.add("T1");
			 Iterator<String> itr = arraylist.iterator();
				while(itr.hasNext()) {
					String name = itr.next();
					System.out.println(name);
				}
				for(int i=0;i<arraylist.size();i++) {
					System.out.println(arraylist.get(i));
				}
		 }
		 else if(currentThread.getName().equals("T2"))
		 {
			 arraylist.add("T2");
			 
			 Iterator<String> itr = arraylist.iterator();
				while(itr.hasNext()) {
					String name = itr.next();
					System.out.println(name);
				}
				for(int i=0;i<arraylist.size();i++) {
					System.out.println(arraylist.get(i));
				}
		 }
	}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
