interface Sortable
{
	public boolean compare(Sortable s[]);
}
class Employee implements Sortable
{
	String name;
	public Employee(String name)
	{
		this.name=name;
	}
	
	boolean compare(Sortable s1[],Sortable s2[])
	{
		
		if(s1.name<((Employee)s2).name)
			return true;
		return false;
	}
	public String toString()
	{
		return ""+this.name;
	}
}
class Circle implements Sortable
{
	double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	@override
	boolean compare(Sortable s1[],Sortable s2[])
	{
		if(s1.radius<((Circle)s2).radius)
			return true;
		return false;
	}
	public String toString()
	{
		return this.radius;
	}
}
public class SortTest
{
	public static void sortAll(Sortable s1[])
	{
		Sortable temp;
	
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].compare(s1[j]))
				{
					temp=s1[i];
					s1[i]=s1[j+1];
					s1[j+1]=temp;
				}
			}
		}
		for(int i=0;i<s1.length;i++)
		{
			System.out.prontln(s1[i]);
		}
	}
	
	public static void main(String args[])
	{
		Sortable se[]=new Sortable[2];
		Sortable sc[]=new Sortable[2];
		se[0]=new Employee("A");
		se[1]=new Employee("B");
		sc[0]=new Circle(22);
		sc[1]=new Circle(55);
		sortAll(se);
		sortAll(sc);
}}