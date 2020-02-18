abstract class DessertItem
{
	abstract void getCost();
}
class Candy extends DessertItem
{
	double tax,taxedcost;
	public Candy(double cost,double tax)
	{
		super(cost);
		this.tax=tax;
	}
	void getCost()
	{
		System.out.println("cost of Candy=1 doller");
	}
}
class Cookies extends Candy
{
	void getCost()
	{
		System.out.println("Cost of Cookie=1 euro");
		
	}		
}
class Icecream extends Cookies
{
	void getCost()
	{
		System.out.println("cost of Icecream=50 rupees");
	}
}	
		public class DessertShop
		{
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Owner or Customer???");
				System.out.println("Press 1 for Owner or 2 for Customer");
				int a=sc.nextInt();
				
		
