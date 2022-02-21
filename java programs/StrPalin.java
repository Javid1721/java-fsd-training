package java_training4;

import java.util.Scanner;

public class StrPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of words: ");
		int len = sc.nextInt();
		System.out.println("Enter the words: ");
		String[] s2 = new String[len];
		for(int i=0;i<len;i++)
		{
			s2[i] = sc.next();
		}
		String temp = "";
		String rev = "";
		for(int i=0;i<len;i++)
		{
			temp = s2[i];
			for(int j=temp.length()-1;j>=0;j--)
			{
				rev = rev+temp.charAt(j);
				
			}
			if(rev.equals(rev))
			{
				System.out.println(temp+"is a palindrome");
				rev ="";
				temp ="";
				continue;
			}
			else
			{
				System.out.println(temp+" is not palindrome");
				
			}
		}
		sc.close();
		
	}

}

