package myPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Table
{

	public static void main(String[] args) 
	{
		
		Scanner obj = new Scanner(System.in);
		
		try
		{
		
		int n;
		
		System.out.println("Enter Any Number :");
		n=obj.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
		
		obj.next();
		obj.next();
		obj.next();
		
		
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Please double check if you are entering number or not ");
			obj.next();
			obj.next();
			obj.next();
		}
		catch (ArithmeticException ex)
		{
			System.out.println("can not divide with zero");
			obj.next();
			obj.next();
			obj.next();
		}
		
		catch (Exception ex) 
		{
			System.out.println("Some error occured");
			System.out.println("Please write to : admin@mycompany.com");
		}
	}

}
	