package java_training4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SampleReadExmp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("D:SampleOutputWriter.txt");
		
		try
		{
			FileReader fr = new FileReader(file1);
			int c;
			while((c=fr.read())!=-1)
			{
				System.out.println((char)c);
			}
			fr.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
