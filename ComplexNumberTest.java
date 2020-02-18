 class ComplexNumber
{
 private int real;
 private int imag;
	public ComplexNumber(int real,int imag)
	{
		this.real=real;
		this.imag=imag;
	}
	public int getReal()
	{
		return this.real;
	}
	public int getImag()
	{
		return this.imag;
	}
	public ComplexNumber add(ComplexNumber n)
	{
		int addreal=this.real+n.real;
		int addimag=this.imag+n.imag;
		//System.out.println(addreal+"+"+addimag+"i");
		ComplexNumber obj1=new ComplexNumber(addreal,addimag);
		return obj1;
	}
	public ComplexNumber subtract(ComplexNumber n)
	{
		int subreal=this.real-n.real;
		int subimag=this.imag-n.imag;
		//System.out.println(subreal+"-"+subimag+"i");
		ComplexNumber obj1=new ComplexNumber(subreal,subimag);
		return obj1;
	}
	public ComplexNumber multiply(ComplexNumber n)
	{
		int mulreal=this.real*n.real;
		int mulimag=this.imag*n.imag;
		//System.out.println(mulreal+"*"+mulimag+"i");
		ComplexNumber obj1=new ComplexNumber(mulreal,mulimag);
		return obj1;
		}
		public String toString(){
			return this.getReal()+"+"+this.getImag()+"i";
		}
		
	
}
public class ComplexNumberTest
{
	public static void main(String args[])
	{
		ComplexNumber c[]=new  ComplexNumber[5];
		c[0]=new ComplexNumber(5,10);
		c[1]=new ComplexNumber(10,20);
		
		System.out.println("Result="+obj1);
		//System.out.println("Result="+obj1.getReal()+"+"+obj1.getImag()+"i");
	}
}



