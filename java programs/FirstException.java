package java_training4;
//nested try-catch block
public class FirstException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			try
			{
				String str = null;
				System.out.println(str.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("It is Null Pointer Exception");
			}
			catch(NumberFormatException e)
			{
				System.out.println("It is Number Format Exception");
			}
			
		Float x = Float.parseFloat("31.abc"); 
		
		}
		catch(NullPointerException e)
		{
			System.out.println("It is Null Pointer Exception");
		}
		catch(NumberFormatException e)
		{
			System.out.println("It is Number Format Exception");
		}
		
		
		
	}
}
