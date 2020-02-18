 class Stack
{
	private int top=0;
	private int size=10;
	private int arr[];
	public Stack(int arr[])
	{
		this.arr=arr;
	}
		public int getTop()
	{
		int i;
		for( i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				break;
	}}
	return i;
	}
	
	boolean push(int x)
	{
		if(getTop()>arr.length)
		{
			System.out.println("overflow");
			return false;
		}
		else{
			arr[getTop()]=x;
			System.out.println(x+"pushed in stack");
			return true;
		
	}
	}	
	public int pop()
	{
		if(getTop()<0)
		{
			System.out.println("underflow");
			return 0;
		}
		else{
		
		int x=arr[getTop()-1];
		return x;
		
	}}
	/*	public int print()
		{
			for(int i=;i<arr.length;i++)
			{
			
		}
		return 	arr[getTop()];}
}*/
	public int peek() 
    { 
        if (getTop() < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = arr[getTop()]; 
            return x; 
        } 
    }
} 	
		public class StackedArray
{
	public static void main(String args[])
	{
		Stack s1=new Stack(new int[10]);
		s1.getTop();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		System.out.println(s1.pop() + " Popped from stack");
}}