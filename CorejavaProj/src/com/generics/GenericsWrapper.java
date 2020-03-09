package com.generics;

import javax.swing.Box;

public class GenericsWrapper {
	Object obj;
	GenericsWrapper(Object obj)
	{
		this.obj=obj;
	}
	public void set(Object obj)
	{
		this.obj=obj;
		
	}
	public Object get()
	{
		return obj;
	}

	public static void main(String[] args) {
	double str=50.0;
	GenericsWrapper g=new GenericsWrapper(str);
	str=(double) g.get();
	System.out.println(str);
	

	}

}
