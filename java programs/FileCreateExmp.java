package java_training4;
import java.io.File;
import java.io.IOException;
public class FileCreateExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File f1 = new File("D:FileCreateExample.txt");
			if(f1.createNewFile())
			{
				System.out.println("a new file named "+f1.getName()+" is created");
			}
			else
			{
				System.out.println("file already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("There is some problem");
			System.out.println(e);
		}
	}

}
