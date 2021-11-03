package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product
{
	int id;
	String name;
	
	public Product(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}


public class MyClass {

	public static void main(String[] args) {
/*
		List<Integer> data = Arrays.asList(56, 78, 92, 77, 99);
		// for
		for (int i = 0; i < data.size(); i++)
			System.out.println(data.get(i));
		System.out.println("");
		// foreach
		for (int d : data)
			System.out.println(d);
		System.out.println("");
		// foreach method with lambda expression ->
		data.forEach(d -> System.out.println(d));
*/
		//Declaring list product
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1, "Mobile"));
		products.add(new Product(2, "Leptop"));
		products.add(new Product(3, "T V"));
		products.add(new Product(4, "A C"));
		products.add(new Product(5, "Fridge"));
		
		// foreach method with lambda expression ->
				products.forEach(p->System.out.println(p.name));
		
		
		
		
	}

}
