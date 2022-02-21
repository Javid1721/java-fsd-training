package java_training2;

abstract class Dog {
	
	public void bark() {
		System.out.println("Bark!!!!");
	}
	public abstract void eat();
}

class Boxer extends Dog {
	
	public void eat() {
		System.out.println("Dog is eating");
	}
}
public class AbstractExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Boxer();
		d.bark();
		d.eat();
	}

}
