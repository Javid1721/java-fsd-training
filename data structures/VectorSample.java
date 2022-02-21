package javanewsample;

import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<>();
		v.add("What");
		v.add("When");
		v.add("Where");
		v.add("Which");
		System.out.println(v);
		System.out.println("The first element: "+v.firstElement());
		System.out.println("The Capacity of vector: "+v.capacity());
		System.out.println("The size of vector: "+v.size());
		v.remove(2);
		System.out.println(v);
	}

}
