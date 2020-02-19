package com.annotations;

import java.lang.annotation.*;
class Annotation{
	@Deprecated
	void print()
	{
		
		System.out.println("Helloooo=");
	}
}





public class AnnotationTest
{
	@SuppressWarnings("deprecation")
public static void main(String args[])
{
	Annotation a1=new Annotation();
	a1.print();
}
}