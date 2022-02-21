package java_training4;
import java.util.Scanner;
public class PrimeNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number");	
		int x = sc.nextInt();
		sc.close();
		if(x == 0 || x == 1) 
		{
			System.out.println("Not a Prime Number");
		}
		else
		{
			
			for(i=2;i<(x/2);i++)
			{
				if(x%i == 0)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println("It's a Prime Number");
			}
			else {
				System.out.println("Not a Prime Number");
			}
		}
		
	}
}
