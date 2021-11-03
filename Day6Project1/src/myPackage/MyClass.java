package myPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MyClass {
	public static void main(String[] args) {
		try {
// step 1 create file object
			File fl = new File("G:\\Mayur\\Hello.txt");

// step 2 create file reader object
			FileReader fr = new FileReader(fl);

// step 3 give file reader to buffer reader to get line by line
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			fr.close();

		} catch (Exception Ex) {	

		}
	}
}