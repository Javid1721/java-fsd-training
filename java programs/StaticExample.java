package java_training4;
class NewStatic
{
	static int Calc(int n)
	{
		return 3*n;
	}
}
public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NewStatic.Calc(5));
		NewStatic a = new NewStatic();
		System.out.println(a.Calc(4));
	}

}
