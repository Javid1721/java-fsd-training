package javanewsample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li = new LinkedList<>();
		li.add("Hit");
		li.add("bit");
		li.add("wit");
		li.add("pit");
		
		Iterator<String> itr = li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
