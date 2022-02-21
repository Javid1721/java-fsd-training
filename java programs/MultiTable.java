package java_training4;
import java.util.*;
public class MultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a positive number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<=0)
		{
			System.out.println("Invalid input");
		}
		else {
			for(int i=1; i<=10; i++) 
			{
				System.out.println(num+"*"+i+" = "+num*i);
			}
		}
		sc.close();
	}

}
