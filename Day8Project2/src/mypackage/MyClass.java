package mypackage;

interface ISalary
{
	static void PrintCompany()
	{
		System.out.println("Microsoft");
	}
	default String Devlopername()
	{
		return "Mayur";
	}
	int getHRA(int basic);
	int getBonus();
}
class Microsoft implements ISalary
{

	@Override
	public int getHRA(int basic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class MyClass
{
	public static void main(String[] args)
	{
		Microsoft obj = new Microsoft();
		System.out.println(obj.Devlopername());
		
		ISalary.PrintCompany();
	}
}
