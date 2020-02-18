import java.util.HashMap;
class MyApp
{
	
	class Cache
	{
	static HashMap<String,Integer> data=new HashMap<String,Integer>();
	
	}
	
		void addData()
			{
				data.put("arko",1);
				data.put("shubham",2);
				data.put("aditya",3);
			}
			void getData()
			{
			//data.get(1);
			//data.get(2);
			//data.get(3);
			for(String i: data.keySet())
			{
				System.out.println("Name="+i+"  Roll no="+data.get(i));
			}
			}
}
	


public class MyAppTest
{
	public static void main(String args[])
	{
		MyApp m1=new MyApp();
		MyApp.Cache m2=m1.new Cache();
		m1.addData();
		m1.getData();
	}
}

			