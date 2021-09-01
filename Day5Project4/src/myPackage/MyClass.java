package myPackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass
{
	public static void main(String[] args)
	{
		String data;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any data :");
		data=obj.next();
		
		
		Pattern p = Pattern.compile("\\D{4,}");
		Matcher m = p.matcher("data");
		
		
		if(m.matches())
			System.out.println("VALID CODE");
		else
			System.out.println("INVALID CODE");
	}

}
