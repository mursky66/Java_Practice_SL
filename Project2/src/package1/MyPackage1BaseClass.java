package package1;

public class MyPackage1BaseClass 
{
	public int a;
	private int b;
	protected int c;
	int d;
	
	public void myPackage1BaseClassMethod()
	{
		a=5;
		b=10;
		c=11;
		d=12;
	}
}

class myPackage1DerivedClass extends MyPackage1BaseClass
{
	public void myPackage1DerivedClassMethod()
	{
		a=5;
		b=10;
		c=11;
		d=12;
	}
}
class myPackage1OtherClass 
{
	public void myPackage1OtherClassMethod()
	{
		MyPackage1BaseClass obj = new MyPackage1BaseClass();
		obj.a=10;
		obj.b=11;
		obj.c=12;
		obj.d=13;
				
	}
}