package javanewsample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Double> que = new LinkedList<>();
		Queue<Double> que2 = new LinkedList<>();
		que.add(10.025);
		que.add(96.99);
		que.add(4734.3207);
		
		System.out.println("Initial Queue-1: "+que);
		que.remove(); //removing first element
		System.out.println("After remove Queue-1 : "+que);
		
		que2.add(7.4);
		que2.add(9.04789);
		que.addAll(que2);
		System.out.println("After implementing add all() : "+que);
		
		int size = que2.size();
	    System.out.println("Size of Queue-2: " +size);
	    
	    que2.clear();
	    System.out.println("After implementing clear() check if Queue-2 is empty: "+que2.isEmpty());
	    
	    System.out.println("Checking the element 1.2 is in Queue 1: "+que.contains(1.2));
	}

}
