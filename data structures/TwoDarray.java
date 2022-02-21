package java_training4;
import java.util.*;
public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of row for array");
		int row = sc.nextInt();
		System.out.println("Enter no.of column for array");
		int col = sc.nextInt();
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		int[][] arr3 = new int[row][col];
		System.out.println("Enter the values for array 1 : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the values for array 2 : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("The sum of two arrays : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" "+arr3[i][j]+" ");
			}
			System.out.println("");
		}
		sc.close();
	}

}
