package comapnayDetails;

import java.util.Scanner;

public class MyClass
{
	public static void main(String[] args)
	{
		//Variable Declaration
		String name;
		int age;
		float height;
		Scanner obj = new Scanner(System.in);
		
		//Read Data From User
		System.out.println("Enter your Name:");
		name=obj.nextLine();
		
		System.out.println("Enter your age : ");
		age=obj.nextInt();
		
		System.out.println("Enter Your height :");
		height=obj.nextFloat();
		
		System.out.println("Your name is  " +name );
		System.out.println("Your age is "+age);
		System.out.println("Your hight is "+ height);
	}
}
