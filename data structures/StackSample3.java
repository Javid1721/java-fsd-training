package javanewsample;

import java.util.Stack;

public class StackSample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Double> stk= new Stack<>();  		
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  		
		stk.push(78.125);  
		stk.push(113.0554);  
		stk.push(90.996);  
		stk.push(120.1);  
		System.out.println("Elements in Stack: " + stk);  	
		stk.pop();
		System.out.println("The last element is: "+stk.peek());
		System.out.println("The position of 113.0554 in the stack is: "+stk.search(113.0554));
	}

}
