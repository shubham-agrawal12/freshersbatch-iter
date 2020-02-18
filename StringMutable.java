public class StringMutable
{
	public static void main(String args[])
	{
		String s="ABC";
		StringBuilder s1=new StringBuilder("hello");
		s1=s1.append("World");
		s=s+"DEF";
		System.out.println("s="+s);
		System.out.println("s1="+s1);
}}