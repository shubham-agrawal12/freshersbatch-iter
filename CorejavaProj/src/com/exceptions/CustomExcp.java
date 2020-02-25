package com.exceptions;

class InsufficientBalanceException extends Exception
{
	private String msg;
	public InsufficientBalanceException()
	{
		this.msg="";
	}
	public InsufficientBalanceException(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		return this.msg;
	}
	
	
	
	
	
}
	

public class CustomExcp {
	static double balance=5000.0;
	
	public void withdraw(double amt)throws InsufficientBalanceException
	{
		if(amt>balance)
		{
			throw new InsufficientBalanceException("Withdrawl amount="+amt+" exceeds balance");
		}
		else
		{
			balance=balance-amt;
			System.out.println("Balance after withdrawl="+balance);
		}
		
	}

	public static void main(String[] args) {
		CustomExcp e1=new CustomExcp();
		System.out.println("Balance "+balance);
		try {
			e1.withdraw(10000);
			
		}
		catch(InsufficientBalanceException e)
		{
			e.printStackTrace();
		}
		

	}

}
