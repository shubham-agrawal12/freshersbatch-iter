package com.java8features;
import java.util.Random;
import java.util.function.Supplier;


public class FunctionTest {

	public static void main(String[] args) {
		Random random=new Random();
		Supplier<Integer> supplier=()->random.nextInt(100);
		
		/*printGrade(Supplier<Integer>supplier)
		{
			Integer marks=supplier.get();
			if(marks>90 && marks<100)
			{
				System.out.println("A"+Supplier.get(95));
			}
			else if(marks>60 && marks<90)
			{
				System.out.println("B");
			}
		}
		printGrade(Spplier);
	}*/

}}
