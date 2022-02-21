package java_training4;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileReadExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f3 = new File("D:FileCreateExample.txt");
			Scanner sc = new Scanner(f3);
			while(sc.hasNextLine())
			{
				String str = sc.nextLine();
				System.out.println(str);
			}
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("there is some issue");
			System.out.println(e);
		}
	}

}
