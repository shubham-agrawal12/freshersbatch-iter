class HospitalOuter
{
	static int bloodP=130;
	static void printMsg()
	{
		System.out.println("Alert!!!!! Blood Pressure is above 140");
	}
	class HospitalInner
	{
		void watch()
		{
			
		while(bloodP<140)
		{
			bloodP++;
			System.out.println("Blood pressure="+bloodP);
		}
		
		printMsg();
		}
	}
	}

public class Hospital{
	public static void main(String args[])
	{
		HospitalOuter h1=new HospitalOuter();
		HospitalOuter.HospitalInner h2=h1.new HospitalInner();
		h2.watch();
	}
}

		