package myPackage;

public class MyClass
{
	
}

class EnglishMessage
{
	public void PrintHi()
	{
		System.out.println("HI");
	}
	public void PrintHello()
	{
		System.out.println("Hello");
	}
	public void GoodMornugn()
	{
		System.out.println("Good Morning");
	}
}

class HindiMessage extends EnglishMessage
{
	@Override
	public void GoodMornugn()
	{
		System.out.println("Subhoday");
	}
}