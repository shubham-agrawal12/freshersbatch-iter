class Employee1 implements Cloneable
{
//private String name;
//private double salary;
DataTest dob;
public Employee1(DataTest dob)
{
	//this.name=name;
	//this.salary=salary;
	this.dob=dob;
}
public Data getDob()
{
	return dob;
}
public void setDob(Data dob)
{
	this.dob=dob;
}

public String toString()
{
	//return "name---"+this.name+"  salary=="+this.salary;
	return this.dob;
}

public Object clone(){
	try{
		return super.clone();
	}
	catch(CloneNotSupportedException e)
	{
		e.printStackTrace();
		return null;
	}
}}

	
public class EmployeeTest1
{
	public static void main(String args[])
	{
		Employee1 e=new Employee1(new Data(19,1,2000));
		Employee1 e2=(Employee1)e.clone();
		System.out.println(e);
		System.out.println(e2);
}
}