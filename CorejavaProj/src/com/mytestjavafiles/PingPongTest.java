package com.mytestjavafiles;

public class PingPongTest extends Thread {

	public static void main(String[] args) {
	

	
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
				catch(Exception e)
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
					System.out.println("\tpong");
					try {
						Thread.sleep(200);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		
	}
	

}
