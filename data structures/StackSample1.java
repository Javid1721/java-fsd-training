package javanewsample;

import java.util.Stack;

public class StackSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stk= new Stack<>();  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		stk.push('A');  
		stk.push('B');  
		stk.push('C');  
		stk.push('D');  
		
		System.out.println("Elements in Stack: " + stk);   
		stk.pop();
		System.out.println("The last element is: "+stk.peek());
		System.out.println("The position of C in the stack is: "+stk.search('C'));
	}

}
