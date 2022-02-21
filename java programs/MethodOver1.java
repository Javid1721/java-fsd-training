//Write Two program to implement method overloading in different ways. Create atleast 4 methods in one program through which method overloading can be implemented

package java_training2;

public class MethodOver1 {
	static void ser()
	{
		System.out.println("No value");
	}
	static void ser(int x)
	{
		System.out.println(x*x);
	}
	static void ser(int x,int y)
	{
		System.out.println(x*y);
	}
	static void ser(int x,int y,int z)
	{
		System.out.println(x*y*z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ser();
		ser(2);
		ser(6,2);
		ser(2,3,2);
	}

}
