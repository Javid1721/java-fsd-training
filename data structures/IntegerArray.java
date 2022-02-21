package java_training4;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int len = sc.nextInt();
		String[] s1 = new String[len];
		System.out.println("Enter the strings: ");
		for(int i=0;i<len;i++)
		{
			s1[i] = sc.next();
		}
		int[] arr = new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i] = Integer.parseInt(s1[i]);
		}
		System.out.println("Integer array is : "+Arrays.toString(arr));
		int sum =0;
		for(int i=0;i<len;i++)
		{
			sum = sum+arr[i];
		}
		System.out.println("Sum of the Integer array is "+sum);
		sc.close();
	}

}
