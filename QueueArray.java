class Queue
{
	private int arr[];
	
	public Queue(int arr[])
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
	
	