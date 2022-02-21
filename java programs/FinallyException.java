package java_training4;
//Exception not handled by catch block but finally executes
public class FinallyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a = 25/0;
			System.out.println(a);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is executed");
		}
		System.out.println("End of the code");
	}

}
