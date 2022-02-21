// program shows how ready() method is used
package java_training4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SampleRead5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
			FileReader frd = new FileReader("D:NewOutput.txt"); // text: HELLOWORLD
			BufferedReader buff = new BufferedReader(frd);
			boolean b = buff.ready(); //returns true if buffer stream is ready to be read.
			System.out.println(b);
			while(b)
			{
				System.out.println((char)buff.read());
				b = buff.ready();
			}
			
			
			
			System.out.println("Checking the buffered reader is ready or not : ");
			System.out.println(b); //returns false if buffer stream is not ready to be read.
			
			
			buff.close();
			frd.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		
	}

}
