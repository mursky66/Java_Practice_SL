package myPackage;

public class MyClass 
{

	public static void main(String[] args) 
	{
		//Object for mathematics - outer class
		Mathemetics m = new Mathemetics();
		
		//Object for Algebra - Inner class
		Mathemetics.Algebra al = m.new Algebra();
		
		System.out.println(al.add(5, 6));
		
	}

}
