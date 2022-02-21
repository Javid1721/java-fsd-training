package java_training4;
import java.util.*;
public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.next();
		char[] ex = s1.toCharArray();
		System.out.println("Character array are");
		for(int i=0;i<ex.length;i++)
		{
			System.out.println(ex[i]+",");
		}
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("Reversed array : ");
		for(int i=ex.length-1;i>=0;i--)
		{
			System.out.println(ex[i]+",");
		}
		char ec;
		String rev="";
		for(int i=0;i<s1.length();i++)
		{
			ec = s1.charAt(i);
			rev = rev+ec;
		}
		System.out.println();
		System.out.println("Reversed character array to string: "+rev);
		sc.close();
	}

}
