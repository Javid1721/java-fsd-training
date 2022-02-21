package javanewsample;

import java.util.PriorityQueue;

public class PriorityQueueSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Hello");
		pq.add("Good");
		pq.add("Morning");
		System.out.println("The Elements in Priority Queue: "+pq);
		System.out.println(pq.poll());
		System.out.println("The Elements after poll : "+pq);
		System.out.println("The first priority element: "+pq.peek());
	}

}
