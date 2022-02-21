package java_training4;

import java.util.Scanner;

public class StrPalindr {
	static boolean Palin(String str)
	{
		int x=0,y=str.length()-1;
		while(x<y)
		{
			if(str.charAt(x)!=str.charAt(y))
			{
				return false;
			}
			x++;
			y--;
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: "); 
		String s1 = sc.nextLine();
		
		String s2[] = s1.split(" "); 
			
		for(int i=0;i<s2.length;i++)
		{
			String s = s2[i];
			if(Palin(s))
			{
				System.out.println(s2[i]+" is palindrome ");
			}
			else
			{
				System.out.println(s2[i]+" is not palindrome");
			}
		}
		sc.close();
	}

}
