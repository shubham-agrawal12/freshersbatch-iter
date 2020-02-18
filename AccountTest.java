class Account
{
	private String name;
	private int id;
	private double Balance;
	
	public Account(){
		this.id=1;
		this.name="shubham";
		this.Balance=1000.00;
	}
	public Account(int id,double Balance,String name)
	{
		this.id=id;
		this.name=name;
		this.Balance=Balance;
	}
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public double getBalance()
	{
		return this.Balance;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setBalance(double Balance)
	{
		this.Balance=Balance;
	}
	
	
	public double deposit(double amt)
	{
		System.out.println("initial balance="+Balance);
		System.out.println("amount deposited="+amt);
		Balance=Balance+amt;
		return Balance;
	}
	public double withdraw(double amt)
	{
		System.out.println("initial balance="+Balance);
		System.out.println("amount withdrawn="+amt);
		Balance=Balance-amt;
		return Balance;
	}
	public String toString()
	{
		return "Id--"+this.getId()+"   Name--"+this.getName()+"   Balance="+this.getBalance();
		
	}
}
public class AccountTest
{
	public static void main(String args[])
	{
		Account a1=new Account();
		Account a2=new Account(2,5000,"arko");
		a2.setName("bharat");
		
		System.out.println(a2);
}}