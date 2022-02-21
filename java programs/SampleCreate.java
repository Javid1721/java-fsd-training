package java_training4;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SampleCreate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str = "Humpty dumpty";
		String str1 = "Playground";
		
		
		FileWriter f = new FileWriter("D:NewOutput.txt");
		BufferedWriter buffer = new BufferedWriter(f);
		
		for(int i=0;i<str.length();i++)
		{
			buffer.write(str.charAt(i));
		}
		f.write("\n");
		char[] c = {'a','b','c'};
		f.write(c); //used to write char array into File Writer
		f.write("\n");
		f.write(str1, 0, 3); // write a portion of a string
		
		f.append(" sat on a wall"); //appending a string
		f.append(str, 2,6 ); //appending a portion of a string
		f.write("\n");
		f.write('a');// writes a single character
		
		System.out.println(f.getEncoding()); // Returns default character encoding being used by the Stream
		
		f.write("\n");
		
		buffer.flush();//it prints current stream and flushes the stream immediately
		//flushes the Stream
		f.close(); //Closes the writer
		System.out.println("Finished writing");
	}

}
