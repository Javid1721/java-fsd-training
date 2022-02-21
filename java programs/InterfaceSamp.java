package java_training3;

interface Dogs {
	
	void bark();
	void run();
}

	


public class InterfaceSamp implements Dogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceSamp ex = new InterfaceSamp();
		ex.bark();
		ex.run();
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dogs bark!!!");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Dog is running");
	}

	

}




