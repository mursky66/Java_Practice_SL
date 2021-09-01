package myPackage;

import java.util.Scanner;

public class MyClass2
{

	public static void main(String[] args) 
	{
		//Declare An Array
		int MAX=5;
		int[]data = new int [MAX];
		int sum=0, average;
		Scanner obj = new Scanner(System.in);
		
		//Read number from user 
		for(int i=0;i<MAX;i++)
		{
			System.out.println("Enter Any Number:");
			data[i]=obj.nextInt();
		}
		//Find Sum 
		for(int d:data)
			sum=sum+d;
		
		//find average
		average=sum/MAX;
				
				System.out.println("sum="+sum);
				System.out.println("average="+average);
		
	}

}
