package java_training4;
import java.util.*;
public class Substrmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first string ");
		String txt1=sc.nextLine();
		System.out.println("Enter the second string ");
		String txt2=sc.nextLine();
		
	
			int result=txt1.indexOf(txt2);
			
			
			if (result!=-1)
			{
				System.out.println(txt2 +"  is present and its a substring  ");
			}
	
			else
			{
				System.out.println(txt2+"  is NOT a substring  ");	
			}
			sc.close();
	}

}
