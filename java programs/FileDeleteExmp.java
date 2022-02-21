package java_training4;
import java.io.File;
public class FileDeleteExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f2 = new File("D:FileCreateExample.txt");
		if(f2.delete())
		{
			System.out.println(f2.getName()+" is deleted successfully");
		}
		else
		{
			System.out.println("There is unexpected error in deletion of file");
		}
	}

}
