import java.util.LinkedList;
import java.util.Queue;

public class QueueSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> que = new LinkedList<>();
		Queue<String> que2 = new LinkedList<>();
		que.add("Today");
		que.add("Yesterday");
		que.add("Tomorrow");
		
		System.out.println("Initial Queue-1: "+que);
		que.remove(); //removing first element
		System.out.println("After remove Queue-1 : "+que);
		
		que2.add("Monday");
		que.addAll(que2);
		System.out.println("After implementing add all() : "+que);
		
		int size = que2.size();
	    System.out.println("Size of Queue-2: " +size);
	    
	    que2.clear();
	    System.out.println("After implementing clear() check if Queue-2 is empty: "+que2.isEmpty());
	    
	    System.out.println("Checking the element Today is in Queue 1: "+que.contains("Today"));
	}

}
