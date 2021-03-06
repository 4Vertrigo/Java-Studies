package courseADTs.stack.exercises;

import java.util.Scanner;
import java.util.Stack;

public class Exercise7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("Insert a number");
		int num = scan.nextInt();

		transformsBinary(num, stack);
		System.out.println(createBinary(stack));
		
		scan.close();
	}
	
	public static String createBinary(Stack<Integer> stack) {
		
		StringBuilder s = new StringBuilder(); 
		
		while(!stack.isEmpty())
			s.append(stack.pop());
		
		return s.toString();
	}
	
	public static void transformsBinary(int num, Stack<Integer> stack) {
		
		if(num < 2)
		{
			stack.push(num%2);
			return;
		}
		
		stack.push(num%2);
		transformsBinary(num/2, stack);
	}

}
