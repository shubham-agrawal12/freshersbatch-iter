package com.mytestjavafiles;

import java.util.concurrent.locks.ReentrantLock;

//wait and notify is obsolete ReentrantLock is a replacement of them
//Code Author:Ark-Angel-Codes
class Practice3 extends Thread {
boolean rule;
public void checkThread()
{
ReentrantLock lock1=new ReentrantLock();
Runnable r1=new Runnable() {
public void run()
{
for(int i =0;i<10;i++)
{
lock1.lock();
System.out.println("Running 1");
try {
Thread.sleep(200);
rule=true;
} catch (InterruptedException e) {
e.printStackTrace();
}
finally
{
if(rule=true)
lock1.unlock();
}
}
}
};
Runnable r2=new Runnable() {
public void run()
{
for(int j=1;j<10;j++) {
lock1.lock();
System.out.println("\t Running 2");
try {
rule=false;
Thread.sleep(200);
} catch (InterruptedException e) {
e.printStackTrace();
}
finally
{
if(rule==false)
lock1.unlock();
}
}

}
};
new Thread(r1).start();
new Thread(r2).start();

}
public static void main(String args[])
{
Practice3 p=new Practice3();
p.checkThread();
}

}