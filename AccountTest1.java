class Accounts
{
	private String name;
	private int id;
	private double amt;
	
	public Accounts(int id,String name,double amt)
	{
		this.id=id;
		this.name=name;
		this.amt=amt;
	}
	public double getBalance()
	{
		return this.amt;
	}
	public String toString()
	{
		return "ID---"+this.id+"  Name---"+this.name+"  Amount in Ac---"+this.getBalance();
	}
}
class SavingsAc extends Accounts
{
	private double fd;
	public SavingsAc(int id,String name,double amt,double fd)
	{
		super(id,name,amt);
		this.fd=fd;
	}
	public double getBalance()
	{
		return super.getBalance()+this.fd;
	}
}
class CurrentAc extends Accounts
{
	private double cashCredit;
	public CurrentAc(int id,String name,double amt,double cashCredit)
	{
		super(id,name,amt);
		this.cashCredit=cashCredit;
	}
	public double getBalance()
	{
		return super.getBalance()+this.cashCredit;
	}
}
public class AccountTest1
{
	public static double getTotalCash(Accounts a[])
	{
		double totalCash=0;
		for(int i=0;i<a.length;i++)
		{
			totalCash=totalCash+a[i].getBalance();
		}
		return totalCash;
	}
	public static void main(String args[])
	{
		Accounts a[]=new Accounts[4];
		a[0]=new SavingsAc(1,"a",1000,5000);
		a[1]=new SavingsAc(2,"b",2000,10000);
		a[2]=new CurrentAc(3,"c",5000,5000);
		a[3]=new CurrentAc(4,"d",1000,5000);
		System.out.println(a[0]);
		System.out.println("total cash in bank="+getTotalCash(a));
}}