package com.mytestjavafiles;

public class PingPongTest1 implements Runnable {

	
	public PingPongTest1()
	{
		Thread t1=new Thread(this);
		Thread t2=new Thread(this);
		t1.setName("ping");
		t2.setName("pong");
		t1.start();
		t2.start();
		
	}
	
	
	
	public static void main(String[] args) {
		new PingPongTest1();

	}
	public void run()
	{
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("ping"))
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("ping");
				try {
					Thread.sleep(100);
				}
				catch(Exception e) {
					e.printStackTrace();
					
				}
			}
		}
		else if(currentThread.getName().equals("pong"))
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("\tpong");
				try {
					Thread.sleep(200);
				}
				catch(Exception e) {
					e.printStackTrace();
					
				}
			}
			
		}
	}

}
