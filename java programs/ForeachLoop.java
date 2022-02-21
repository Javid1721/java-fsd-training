package java_training3;

import java.util.ArrayList;

public class ForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> itemArray = new ArrayList<>();
		itemArray.add("item1");
		itemArray.add("item2");
		itemArray.add("item3");
		for(String item : itemArray)
		{
			System.out.println(item);
		}
		
	}

}
