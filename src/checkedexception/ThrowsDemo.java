package checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
 //if we don't want to handle exception at particular moment then we can use throws keyword with exception type and then compiler won't complain
public class ThrowsDemo {
	void readFile() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("");
	}

	public static void main(String[] args) {
		ThrowsDemo th = new ThrowsDemo();
		try {
		th.readFile();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
