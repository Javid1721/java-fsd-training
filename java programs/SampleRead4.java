package java_training4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SampleRead4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
			FileReader frd = new FileReader("D:NewOutput.txt"); // text: HELLOWORLD
			BufferedReader buff = new BufferedReader(frd);
			boolean b = buff.ready(); //returns true if buffer stream is ready to be read.
			System.out.println("Checking Reader is ready or not(true/false)?:   "+b);
			
			System.out.println((char)buff.read());
			System.out.println((char)buff.read());
			System.out.println((char)buff.read());
			buff.mark(0);
			System.out.println("Mark invoked, printing after mark");
			System.out.println((char)buff.read());
			buff.reset();
			System.out.println("Reset the reader: ");
			System.out.println((char)buff.read());
			System.out.println((char)buff.read());
			

			buff.close();
			frd.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		
		
	}

}
