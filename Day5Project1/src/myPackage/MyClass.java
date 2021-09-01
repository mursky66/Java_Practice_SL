package myPackage;

public class MyClass 
{

	public static void main(String[] args) 
	{
		//1-D array
		int[] data = new int[] {4,5,6,7,9};
		
		//2-D array
		int [][] matrix = new int [][] {{1,2},{3,4},{7,9}};
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0; j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+"");
			}
			System.out.print("\n");
		}
			
		
		// pattern program 
		
		for(int i=1;i<=6;i++)
			{
				System.out.println("* ");
			}
			System.out.println("\n");
			
			//Jagged Array
			
			char[][] names = new char[][]
					{
						new char[] {'m','a','y','u','r'},
						new char[] {'B','h','a','r','a','t','b','h','a','i'},
						new char[] {'s','o','l','a','n','k','i'}
						
					};
					
					for(int i=0;i<names.length;i++)
					{
						for(int j=0;j<names[i].length;j++)
						{
							System.out.printf(names[i][j]+"");
						}
						System.out.printf("\n");
					}
			
	}

}
