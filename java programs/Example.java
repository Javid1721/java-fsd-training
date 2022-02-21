package java_training2;
class Bike{
	int speed=90;
}
class Honda extends Bike{
	int speed=150;
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new Honda();
		System.out.println(obj.speed);
	}

}
