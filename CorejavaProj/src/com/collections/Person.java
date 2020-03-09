package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

 class Person implements Comparable<Person> {
	String name;
	double weight,height;
	public Person(String name,double weight,double height)
	{
		this.name=name;
		this.weight=weight;
		this.height=height;
	}
	public String toString()
	{
		return "Name--"+this.name+"\tWeight--"+this.weight+"\theight--"+this.height;
	}

	
	public static void testTreeset()
	{
		Person p1=new Person("shubham",50.0,163.0);
		Person p2=new Person("arko",60.0,133.0);
		Person p3=new Person("bharat",30.0,193.0);
		TreeSet<Person> treeset=new TreeSet<Person>();
		treeset.add(p1);
		treeset.add(p2);
		treeset.add(p3);
		
		Iterator<Person> itr=treeset.iterator();
		while(itr.hasNext()) {
			Person p=itr.next();
			System.out.println(p);
		}
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		testTreeset();

	}


	@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
