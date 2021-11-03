package myPackage;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyClass
{
	public static void main(String[] args)
	{
		List<Integer> data = Arrays.asList(4,6,22,45,78,66,57);
			
		int searchElement,loc=0;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter search element:");
		searchElement = obj.nextInt();
		
		//foreach loop
		for(int d:data)
		{		
			if(d==searchElement)
			{
				System.out.println("Elemet found at Location "+loc);
				break;
			}
			loc++;
		}
		
		if(loc==data.size())
			System.out.println("Element Not Found:");
	}
}
