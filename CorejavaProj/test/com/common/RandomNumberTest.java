package com.common;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RandomNumberTest {

private static RandomNumber r;
	
	
	@Parameterized.Parameters
	public static Collection randomN() {
		System.out.println("inside randomnumber collection");
		r=new RandomNumber();
		return Arrays.asList(new Object[][] {
			{},{},{}
		
		});
	}
	@Test
	public void testGenerate() {
	
	int rNumber=r.generate();
	
	assertTrue(rNumber>=1 && rNumber<=100);
	System.out.println(rNumber);
		
	}

}
