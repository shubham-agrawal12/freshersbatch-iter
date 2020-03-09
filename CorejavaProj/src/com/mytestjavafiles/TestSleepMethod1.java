package com.mytestjavafiles;

public class TestSleepMethod1 implements Runnable {
	//Runnable r1=new Runnable();
	
	public void run(){  
		  for(int i=1;i<5;i++){  
		    try{
		    	Thread.sleep(500);
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(i);  
		  }  
		 }  
	
		 public static void main(String args[]){  
		  TestSleepMethod1 m1=new TestSleepMethod1();  
		  TestSleepMethod1 m2=new TestSleepMethod1();  
		  Thread t1=new Thread(m1);
		/*  Thread
		   
		  t1.start();  
		  t2.start();  */
		 }  

}
