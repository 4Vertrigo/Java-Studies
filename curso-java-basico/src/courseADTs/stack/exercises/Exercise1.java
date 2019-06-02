package courseADTs.stack.exercises;

import java.util.Scanner;
import java.util.Stack;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		getIn(scan, stack);
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}

	public static void getIn(Scanner scan, Stack<Integer> stack) {
		
		int num;
		
		System.out.println("Insert ten integers");
		for(int i = 0; i < 10; i++)
		{
			num = scan.nextInt();
			
			if(num % 2 == 0)
				stack.push(num);
			else
			{
				if(!stack.isEmpty())
					stack.pop();
				else
					System.out.println("Stack is empty");
			}
		}
	}
}
