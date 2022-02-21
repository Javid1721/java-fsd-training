package java_training4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class SampleReadEx3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = null;
		try 
		{
			fr = new FileReader("D:NewOutput.txt");
			
			char[] a = new char[10];
			fr.read(a,0,8);		//Reads character into an array with offset and length
			
			for(char c:a)
			{
				System.out.println(c);
			}
			
			
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		
		
		System.out.println("type of encoding: "+fr.getEncoding());
		fr.close();
	}

}
