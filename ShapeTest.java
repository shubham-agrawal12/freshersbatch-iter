abstract class Shape{
	abstract void draw();
}


class Line extends Shape
{
	void draw()
	{
		System.out.println("line is drawn");
	}
}
class Rectangle extends Line
{
	void draw()
	{
		System.out.println("rectangle is drawn");
}}
class Cube extends Line
{
	void draw()
	{
		System.out.println("cube is drawn");
}}




public class ShapeTest
{
	public static void main(String args[])
	{
		Shape s1[]=new Shape[3];
		s1[0]=new Line();
		s1[1]=new Rectangle();
		s1[2]=new Cube();
		for(int i=0;i<s1.length;i++)
		{
			s1[i].draw();
}}}
			

		