package javanewsample;

import java.util.Stack;

public class StackSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<>();
		boolean result = st.empty();  
		System.out.println("Is the stack empty? " + result);  
		st.push("Foden");
		st.push("Mahrez");
		st.push("Kevin De bruyne");
		st.push("Ruben");
		st.push("Stones");
		
		System.out.println("The stack elements are: "+st);
		st.pop();
		st.pop();
		System.out.println("The stack elements after pop operation : "+st);
		System.out.println("The last element is: "+st.peek());
		System.out.println("The position of Mahrez in the stack is: "+st.search("Mahrez"));
		
	}

}
