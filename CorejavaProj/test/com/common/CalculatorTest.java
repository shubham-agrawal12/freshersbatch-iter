package com.common;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
Calculator c=null;
static Calculator c1=null;
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("Before class!!!!!!!!!!!!!!1");
		c1=new Calculator();
	}
	@Before
	public void before()
	{
		System.out.println("Before test");
		c=new Calculator();
	}
	

	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		assertEquals("Result",5,c.add(2,3));
	
	}
	
	@Test
	public void testSub() {
		Calculator c=new Calculator();
		assertEquals("Result",2,c.sub(5,3));
		
	}
	@Test(expected=ArithmeticException.class)
	public void testDiv() {
		Calculator c=new Calculator();
		assertEquals("Result",2,c.div(10,0));
		
	}
	@After
	public void after()
	{
		System.out.println("after test");
		c=new Calculator();
	}
	@AfterClass
	public static void afterclass() {
	System.out.println("After class!!!!!!!!!!!!!1");
	c1=new Calculator();
	}

}
