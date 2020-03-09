package com.java8features;
@FunctionalInterface
interface Calculate
{
	int cal(int x,int y);
}

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		int a=10,b=5;
		Calculate c=(int x,int y)->x*y;
		Calculate c1=(int x,int y)->x+y;
		Calculate c2=(int x,int y)->x-y;
		Calculate	c3=(int x,int y)->x/y;
				
		int result=c.cal(a,b);
		System.out.println(a+"*"+b+"="+result);
		result=c1.cal(a,b);
		System.out.println(a+"+"+b+"="+result);
		result=c2.cal(a,b);
		System.out.println(a+"-"+b+"="+result);
		result=c3.cal(a,b);
		System.out.println(a+"/"+b+"="+result);

	}

}
