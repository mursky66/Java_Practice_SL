package myPackage;

import java.io.FileWriter;

public class FileWr {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("G:\\Mayur\\Hello.txt");
			fw.write("\n Mayur Bharatbhai Solanki");
			fw.close();
			System.out.println("File Writing done");

		} catch (Exception Ex) {

		}
	}

}
