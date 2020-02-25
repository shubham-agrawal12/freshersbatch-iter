package com.multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTankTemplate extends Frame {
	private int y=400;
	private int height=0;
	private int percent = 70;
	public WaterTankTemplate() {
		super("Ball game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.RED);
		//g.fillRect(150, 200, 200, 200);
		g.fillRect(150, y, 200, height);
		g.drawString(percent + "%", 380, 200);
	}

	public static void main(String[] args) {
		WaterTankTemplate waterTank = new WaterTankTemplate();
		waterTank.setSize(500, 500);
		waterTank.setVisible(true);
		waterTank.new WaterManagement("INLET");
		waterTank.new WaterManagement("OUTLET");
		//waterTank.new WaterManagement("CONTROLLER");
	}

	class WaterManagement implements Runnable {
		Thread t,tInlet,tOutlet,tController;
		
		/*public WaterManagement() {
			tInlet = new Thread(this,"INLET");
			tOutlet = new Thread(this,"OUTLET");
			tController = new Thread(this,"CONTROLLER");
			tInlet.start();
			Thread t;*/
			public WaterManagement(String threadName) {
				tInlet = new Thread(this, threadName);
				tOutlet = new Thread(this, threadName);
				tController = new Thread(this, threadName);
				//tController.setDaemon(true);
				tInlet.start();
				tOutlet.start();
				
				//tController.start();
			
		}
		public void run() {
			
		if(Thread.currentThread().getName().equals("INLET")) {
				
				for(int i=0;i<60;i++) {
					y = y - 5;
					height = height + 5;
					System.out.println(height);
					
					
					repaint();
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			
		}
		else if(Thread.currentThread().getName().equals("OUTLET"))
		{
			
			for(int i=0;i<60;i++) {
				y = y + 5;
				height = height - 5;
				System.out.println("\t"+height);
				
				repaint();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
			
		
			else if(Thread.currentThread().getName().equals("CONTROLLER")) {
				//tOutlet.suspend();
				for(int i=0;i<60;i++)
				{
					
				System.out.println("\t "+height);
				if(height>200)
				{
					tInlet.suspend();
				}
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			
				
			}
		}
	}}