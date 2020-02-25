package com.wrapper;

class Wrapper
{
	
	public void sort(int a[])
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
}
		
}
}
		
public class Mywrapper
{
	
	public static void main(String args[])
	{
		int x[]=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
		x[i]=Integer.parseInt(args[i]);
		}		
		Wrapper w=new Wrapper();
		w.sort(x);
		}}
		