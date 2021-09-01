package myPackage;

public class Mathemetics
{
	public final float PI = (float)22/7;
	
	class Algebra 
	{
		public int add(int a, int b)
		{
			return a+b;
		}
	}
	class Geometry 
	{
		public float CircleArea(int r)
		{
			return PI*r*r;
		}
		public float circlePerimeter(int r) 
		{
			return 2*PI*r;
		}
	}
}
