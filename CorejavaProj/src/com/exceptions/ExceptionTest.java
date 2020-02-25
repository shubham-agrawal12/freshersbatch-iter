package com.exceptions;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			System.out.println("inside try");
			System.out.println("Getting division");
			int a=10/0;
			System.out.println("a="+a);
		}
		
		finally {
			System.out.println("yoyo you r in finally");
		}
		
		
		
		System.out.println("exit main");

	}

}
