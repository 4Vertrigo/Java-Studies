package courseADTs.stack;

import java.util.Stack;

import courseADTs.queue.MyPriorityQueue;

public class Main {

	public static void main(String[] args) {

		MyStack<Integer> stack = new MyStack<Integer>();
		
		System.out.println(stack);
		System.out.println(stack.size());
		
		for(int i = 1; i <= 10; i++)
			stack.push(i);
		
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack);
		
		
		Stack<Integer> stackAPI = new Stack<Integer>();
		
		System.out.println(stackAPI.isEmpty());
		stackAPI.push(1);
		stackAPI.push(2);
		stackAPI.push(3);
		System.out.println(stackAPI);
		System.out.println(stackAPI.size());
		System.out.println(stackAPI.peek());
		System.out.println(stackAPI.pop());
		System.out.println(stack);
		
	}

}
