package java_training4;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class FileWriteExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter obj1 = new FileWriter("D:FileCreateExample.txt");
			PrintWriter pw = new PrintWriter(obj1);
			pw.println("I am Earth");
			pw.println("I have seven Continents");
			pw.println("I have five oceans");
			obj1.close();
		}
		catch(IOException e)
		{
			System.out.println("there is some issues");
			System.out.println(e);
		}
		System.out.println("file write done successfully");
	}

}
