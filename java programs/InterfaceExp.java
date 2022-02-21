package java_training2;


interface WaterBottleInterface {
	String color = "Blue";
	
	void fillUp();//public & abstract
}


public class InterfaceExp implements WaterBottleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(color);
		
		InterfaceExp a = new InterfaceExp();
		a.fillUp();
	}

	@Override
	public void fillUp() {
		// TODO Auto-generated method stub
		System.out.println("It is filled");
	}
	

}
