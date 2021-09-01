package myPackage;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.readData();
		emp.printData();
	}

}
class Employee 
{
	public String name;
	public int salary;
	public int age;
	
	
	public void readData()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Name:");
		name=obj.next();
		System.out.println("Enter Salary:");
		salary=obj.nextInt();
		System.out.println("Enter age:");
		age=obj.nextInt();
		obj.close();
	}
	
	public void printData()
	{
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Salary = "+salary);
		
	}
}