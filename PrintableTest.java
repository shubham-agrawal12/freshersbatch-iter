 interface Printable
{
	public void print();
	}
	
	class Employee implements Printable
	{
	public void print()
	{
		System.out.println("Employee");
	}
	}
	class Circle implements Printable
	{
	public void print()
	{
		System.out.println("Circle");
	}
	}
	public class PrintableTest
	{
	public static void printAll(Printable p1[])
	{
		for(int i=0;i<p1.length;i++)
		{
			p1[i].print();
		}
	
	}
	public static void main(String args[])
	{
		Printable p[]=new Printable[3];
		p[0]=new Employee();
		p[1]=new Circle();
		p[2]=new Circle();
		printAll(p);
	}
	}
	