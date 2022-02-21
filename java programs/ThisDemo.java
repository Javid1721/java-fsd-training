package java_training4;

public class ThisDemo {
	ThisDemo()
	{
		this(600);
		
	}
	ThisDemo(int num)
	{
		
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo r = new ThisDemo();
		
		
	}

}
//class Calc
//{
//	int num1;
//	int num2;
//	int result;
//	public Calc(int num1, int num2)
//	{
//		this.num1=num1; //represents current object
//		this.num2=num2;
//	}
//	
//}
