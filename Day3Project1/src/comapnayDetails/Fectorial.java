package comapnayDetails;

public class Fectorial
{
	static int factorial(int n)
	{
		int i=1, fact=1;
		for(i=1;i<=n;i++)
			fact=fact*i; 	
		return fact;
		
	}

	public static void main(String[] args)
	{
	/*
		int n1=4,i,fact1=1;
		int n2=5,fact2=1;
		int n3=7,fact3=1;								//BAD CODE
		for(i=1;i<=n1;i++)
			fact1=fact1*i;
		for(i=1;i<=n2;i++)
			fact2=fact2*i;
		for(i=1;i<=n3;i++)
			fact3=fact3*i;
		*/
	
		int n1=4,n2=5,n3=7;
		System.out.println(factorial(n1));
		System.out.println(factorial(n2)); 			// THIS IS GOOD CODE 
		System.out.println(factorial(n3));			// HERE WE CREATE FUNCTION 
		
	}

}
