import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		System.out.println("Enter Number ");
		Scanner Sc = new Scanner(System.in);
		int i = Sc.nextInt();
		
		if(i%2==0) 
			System.out.println("Even Number");
		else 
			System.out.println("Odd Number ");
	}

}
