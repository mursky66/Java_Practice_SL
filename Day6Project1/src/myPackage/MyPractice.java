package myPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Product implements Serializable {
	String name;
	int price;

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

public class MyPractice {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * The Below code is Serialization
		 */

		Product p = new Product("Apple", 5000);

// step1
		FileOutputStream fos = new FileOutputStream("G:\\Mayur\\product.txt");

// step2
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p);

		System.out.println("Object Store in file :");

		oos.close();
		fos.close();

		/*
		 * The Below code is D-Serialization
		 */

		/*
		 * FileInputStream fis = new FileInputStream("G:\\Mayur\\R_product.txt");
		 * 
		 * ObjectInputStream ois = new ObjectInputStream(fis);
		 * 
		 * Product p =(Product)ois.readObject();
		 * 
		 * System.out.println(p.name); System.out.println(p.price);
		 * 
		 * ois.close(); fis.close();
		 * 
		 */

	}

}
