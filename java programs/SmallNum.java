package java_training3;

public class SmallNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=15,c=2,small;
		small = (a<b) ? (a<c?a:c) : (b<c?b:c);
		System.out.println("Smallest Number is "+small);
	}

}
