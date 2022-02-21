package javanewsample;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {   
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum=0,fact;
		int n = num;
		
		while(n!=0)
		{
			fact=1;
			int r = n%10;
			for(int i=1;i<=r;i++)
			{
				fact = fact * i; 
			}
			sum=sum+fact;
			n=n/10;
		}	
		if(num == 0)
		{
			System.out.println("Not a strong number");
		}
		else if(sum == num)
		{
			System.out.println(num+" Is a strong number");
		}
		else
		{
			System.out.println("Not a strong Number");
		}
		sc.close();
		
	}

}
