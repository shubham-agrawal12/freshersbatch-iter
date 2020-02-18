class Employee
{
	private String name;
	private int id;
	private double salary;
	
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public double getSalary()
	{
		return this.salary;
	}
	
	public String toString()
	{
		return "ID---"+this.id+"  Name--"+this.name+"  Salary--"+this.getSalary();
	}
	
}
class Manager extends Employee
{
	private double incentives;
	public Manager(int id,String name,double salary,double incentives)
	{
		super(id,name,salary);
		this.incentives=incentives;
	}
	public double getSalary()
	{
		return super.getSalary()+this.incentives;
	}

}
class Labour extends Employee
{
	double overtime;
	public Labour(int id,String name,double salary,double overtime)
	{
		super(id,name,salary);
		this.overtime=overtime;
	}
	public double getSalary()
	{
		return super.getSalary()+this.overtime;
	}
	
	
}

public class EmployeeTest
{
	public static double getTotalSal(Employee e[])
	
	{
		double totalSal=0;
		for(int i=0;i<e.length;i++)
		{
			totalSal=totalSal+e[i].getSalary();
	}
	return totalSal;
	}
	public static void main(String args[])
	{
		Employee e[]=new Employee[4];
		 e[0]=new Manager(1,"a",5000,1000);
		 e[1]=new Manager(2,"b",6000,1000);
		 e[2]=new Labour(3,"c",5000,3000);
		 e[3]=new Labour(4,"d",10000,1000);
		 System.out.println(e[3]);
		System.out.println("total salary of employee="+getTotalSal(e));
}}
		