package java_training4;

public class SecondException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String str = "Hello Sayed";
			
			
			str.charAt(11);
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception");
		}
	}

}
