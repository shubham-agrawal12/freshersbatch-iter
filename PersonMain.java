import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonNameComparator implements Comparator<Order>
{
	@Override
	public int compare(Order p1, Order p2) {
		return p1.name.compareTo(p2.name)*-1;
	}
}
class PersonHeightComparator implements Comparator<Order>
{
	@Override
	public int compare(Order p1,Order p2)
	if(p1.height>p2.height){
		return -1;
	}
	else if(p1.height<p2.height)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
class PersonWeightComparator implements Comparator<Order>
{
	@Override
	public int compare(Order p1,Order p2)
	if(p1.weight>p2.weight)
	{
		return -1;
	}
	else if(p1.weight<p2.weight)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

class Order implements Comparable<Order>
{
	String name;
	double height;
	double weight;
	public Person(String name,double height,double weight)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	public String toString()
	{
		return "Name--"name+"  Height--"+height+"  Weight--"+weight;
	}
}
public class PersonMain
{
	public static void main(String args[])
	{
		Order p1=new Order("Shubham",155,60);
		Order p2=new Order("Arko",150,70);
		Order p3=new Order("Bharat",190,90);
		List<Order> list = new ArrayList<Order>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
	
	
	Collections.sort(list, new PersonNameComparator()); //calls Comparator
		
		for(Order order: list) {
			System.out.println(order);
}}}