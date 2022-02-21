package javanewsample;

import java.util.HashSet;

public class HashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Red");
		hs.add("Red");
		hs.add("Blue");
		hs.add("Red");
		hs.add(null);
		//doesn't contain duplicate elements
		System.out.println("The set: "+hs);
		
	}

}
