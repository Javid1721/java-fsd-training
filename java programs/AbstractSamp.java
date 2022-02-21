package java_training3;


abstract class Cat {
	
    
	public void type() {
		System.out.println("Himalayan Cat");
		
	}
	public abstract void run();
	public abstract void sound();
}


class NewCat extends Cat {
	
	public void run() {
		System.out.println("Cat is running");
	}
	
	public void sound() {
		System.out.println("Cat sounds MEOW!");
	}
}


public class AbstractSamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new NewCat();
		c.type();
		c.run();
		c.sound();
	}

}
