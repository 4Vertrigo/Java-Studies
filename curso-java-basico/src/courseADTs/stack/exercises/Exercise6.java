package courseADTs.stack.exercises;

import java.util.Scanner;
import java.util.Stack;

public class Exercise6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean expRight = true;
		Stack<Character> stack = new Stack<Character>();
		
		
		System.out.println("Insert an expression:");
		String expression = scan.nextLine();
		
		for(int i = 0; i < expression.length(); i++)
		{
			if(expression.charAt(i) == '(')
				stack.push(expression.charAt(i));
			else if(expression.charAt(i) == ')')
			{
				if(!stack.isEmpty())
					stack.pop();
				else
				{
					expRight = false;
					break;
				}
			}
		}
		
		if(expRight)
		{
			if(!stack.isEmpty())
				System.out.println("The expression hasn't close a '('");
			else
				System.out.println("The expression is right");
		}
		else
			System.out.println("The expression has closed a ')' without open a one before");
		
		scan.close();
		
	}
}
