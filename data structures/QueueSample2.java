package javanewsample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Character> que = new LinkedList<>();
		Queue<Character> que2 = new LinkedList<>();
		que.add('A');
		que.add('B');
		que.add('C');
		
		System.out.println("Initial Queue-1: "+que);
		que.remove(); //removing first element
		System.out.println("After remove Queue-1 : "+que);
		
		que2.add('X');
		que2.add('Y');
		que.addAll(que2);
		System.out.println("After implementing add all() : "+que);
		
		int size = que2.size();
	    System.out.println("Size of Queue-2: " +size);
	    
	    que2.clear();
	    System.out.println("After implementing clear() check if Queue-2 is empty: "+que2.isEmpty());
	    
	    System.out.println("Checking the element Y is in Queue 1: "+que.contains('Y'));
	}

}
