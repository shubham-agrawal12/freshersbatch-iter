class Data{
	private int day,month,year;
	
	public Data()
	{
		this.day=26;
		this.month=11;
		this.year=2020;
	}
	public Data(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay()
	{
		return this.day;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getYear()
	{
		return this.year;
	}
	
	public void setDay(int day)
	{
		this.day=day;
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public String toString()
	{
		return this.getDay()+"."+this.getMonth()+"."+this.getYear();
	}
	
}
	public class DataTest
	{
		public static void main(String args[])
		{
			Data d1=new Data();
			Data d2=new Data(12,3,2010);
			
			System.out.println("Date is="+d2.toString());
	}}