package java_training4;
import java.io.File;
public class FileGetExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:FileCreateExample.txt");
		if(f.exists())
		{
			System.out.println("The name of the file is: "+f.getName());
			System.out.println("Is the file writable: "+f.canWrite());
			System.out.println("The absolute path of the file is: "+f.getAbsolutePath());
			System.out.println("Is the file readable: "+f.canRead());
			System.out.println("The size of the file is: "+f.length());
		}
		else
		{
			System.out.println("file not exist");
		}
	}

}
