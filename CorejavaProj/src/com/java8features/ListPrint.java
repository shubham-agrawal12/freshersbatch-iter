package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListPrint {

	public static void main(String[] args) {
		List<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(40);
		
		Consumer<Integer> consmer=(Integer)->System.out.println(Integer);
		Runnable r1=new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<arraylist.size();i++)
				{
					consmer.accept(arraylist.get(i));
					try {
						Thread.sleep(100);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		};
		new Thread(r1).start();
		
	}

}
