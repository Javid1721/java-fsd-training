package java_training3;

public class Logical_OR_And {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		int x=100,y=50;
		
		if((x>60) && (y>40) && (x>150))
		{
			System.out.println("Vegetables are fresh");
		}
		else
		{
			System.out.println("Fruits are fresh");
		}
		
		if((x>60) || (y>40) || (x>150))
		{
			System.out.println("Vegetables are fresh");
		}
		else
		{
			System.out.println("Fruits are fresh");
		}
	}

}
