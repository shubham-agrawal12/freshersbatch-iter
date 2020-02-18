class SingleTone
{
	private static SingleTone ref=null;
	private SingleTone()
	{
	}
	public static SingleTone getInstance()
	{
		if (ref==null)
			ref=new SingleTone();
		return ref;
}

}
public class SingleToneTest
{
	public static void main(String args[])
	{
		SingleTone s1=new SingleTone();
		//SingleTone s2=new SingleTone();
		s1.getInstance();
}}