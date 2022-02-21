package java_training4;

public class ThrowException {
	static void resultCheck(int marks)
	{
		if(marks<45)
		{
			throw new ArithmeticException("You are failed in Exam!");
		}
		else
		{
			System.out.println("Congrats, You passed the exam!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		resultCheck(40);
	}

}
