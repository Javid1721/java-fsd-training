package java_training2;

public class MethodOver2 {
	static void exp()
	{
		System.out.println("Hello world");
	}
	
	static void exp(int a,double b)
	{
		double c = b/a;
		System.out.println(c);
	}
	static void exp(String myText,int b)
	{
		
		System.out.println("Output will be: "+myText+" "+b);
	}
	static void exp(char a,char b,float c)
	{
		System.out.println(a+" "+b+" "+c);
	}
	static void exp(boolean myBool)
	{
		
		System.out.println(myBool+" "+myBool);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp(false);
		exp('B','Y',4);
		exp(3,10);
		exp("Hello",3);
		exp();
	}

}
