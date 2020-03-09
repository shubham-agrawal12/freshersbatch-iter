package com.multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class OvalGame extends Frame implements Runnable {

	static int y1 = 400;
	int y2 = 400;
	int y3 = 400;
	Thread ball1=new Thread(this);
	Thread ball2=new Thread(this);
	Thread ball3=new Thread(this);
	public OvalGame() {
		super("Oval game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		ball1.setName("b1");
		ball2.setName("b2");
		ball3.setName("b3");
		ball1.start();
		ball2.start();
		ball3.start();
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	 public void run()
	{
		int i=0;
		Thread currentThread=Thread.currentThread();
		for(;;)
		{
		if(currentThread.getName().equals("b1"))
		{
			
		while(y1>75)
		{
			try {
				Thread.sleep(10);
				y1=y1-1;
				
				repaint();
				System.out.println(y1);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
				
		}
		while(y1<=400)
		{
			try {
				Thread.sleep(10);
				y1=y1+1;
				
				repaint();
				System.out.println(y1);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		}
		else if(currentThread.getName().equals("b2"))
		{
			while(y2>75)
			{
				try {
					Thread.sleep(15);
					y2=y2-1;
				
					repaint();
					System.out.println("\t"+y2);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
					
			}
			while(y2<=400)
			{
				try {
					Thread.sleep(15);
					y2=y2+1;
					
					repaint();
					System.out.println("\t\t"+y2);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				
			}
		}
		else if(currentThread.getName().equals("b3"))
		{
			while(y3>75)
			{
				try {
					Thread.sleep(20);
					y3=y3-1;
					
					repaint();
					//System.out.println("\t"+y2);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
					
			}
			while(y3<=400)
			{
				try {
					Thread.sleep(20);
					y3=y3+1;
					
					repaint();
					//System.out.println("\t\t"+y2);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				
			}
		}
		
		
		}
	}
	
		
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}

	public static void main(String[] args) {
		Frame mf = new OvalGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
		
	}
}