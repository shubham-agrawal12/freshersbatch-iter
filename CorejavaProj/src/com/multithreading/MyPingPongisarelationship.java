package com.multithreading;

public class MyPingPongisarelationship extends Thread{
	
	//Creating IS-A Relationship
		
	
		/*
		public MyPingPongisarelationship(String threadname)
		{
			super.setName(threadname);
			super.start();
		}*/

		public static void main(String[] args) {
			
			//new MyPingPongisarelationship("PING");
			//new MyPingPongisarelationship("PONG");
			
			
			//Anonymous Inner class
			Runnable r1=new Runnable()
					{
				public void run()
				{
					for(int i=0;i<20;i++)
					{
						System.out.println("PING");
					
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
					Runnable r2=new Runnable()
					{
				public void run()
				{
					for(int i=0;i<20;i++)
					{
						System.out.println("\tPONG");
					
					try {
						Thread.sleep(300);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					}
				}
					};
					Runnable r3=new Runnable()
					{
				public void run()
				{
					for(;;)					//infinite loop
					{
						System.out.println("\t\tTONG");
					
					try {
						Thread.sleep(200);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					}
				}
					};
					ThreadGroup th1=new ThreadGroup("parent thread");
					Thread t1=new Thread(th1,r1,"one");
					Thread t2=new Thread(th1,r2,"two");
					Thread t3=new Thread(th1,r3,"three");	
					t3.setDaemon(false);			             //Daemon method
					t1.start();
					t2.start();
					t3.start();
					th1.list();
					

		}
		/*public void run()
		{
			Thread currentThread=Thread.currentThread();
			if(currentThread.getName().equals("PING"))
			{
				for(int i=0;i<20;i++)
				{
					System.out.println("PING");
				
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				}
		}
			else if(currentThread.getName().equals("PONG"))
			{
				for(int i=0;i<20;i++)
				{
					System.out.println("\tPONG");
				
				try {
					Thread.sleep(300);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
		}}
			

	}*/
	}



