package java_training4;
import java.util.Scanner;
public class PercentAttend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No.of Classes held: ");
		float a = sc.nextFloat();
		System.out.println();
		System.out.print("Enter No.of Classes attended: ");
		float b = sc.nextFloat();
		float percent = (b/a)*100;
		System.out.println("Percentage of classes attended is: "+percent+"%");
		if(percent<75)
		{
			System.out.println("Candidate is not allow to sit in exam");
		}
		else
		{
			System.out.println("Candidate is allow to sit in exam");
		}
		sc.close();
	}

}
