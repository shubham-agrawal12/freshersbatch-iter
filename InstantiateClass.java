import java.lang.reflect.*;


class InstantiateClass
{
	public static void main(String args[])
	{
		Class cls=Class.forName(args[0]);
		Constructor con[]=c.getDeclaredConstructor();
		if(con.length==0)
		{
			Object obj=cls.newInstance();
		}
		
		for(int i=0;i<con.length;i++)
		{
			Constructor constructor=InstantiateClass.class.getDeclaredConstructor();
			Class paramTypes[]=constructor.getParameterTypes();
			if(paramTypes.length==0)
			{
			hasDefaultConstructor=true;
			}
		}
if(hasDefaultConstructor==true)
{
	
	