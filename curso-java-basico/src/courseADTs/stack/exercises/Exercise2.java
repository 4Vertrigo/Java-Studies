package courseADTs.stack.exercises;

import java.util.Scanner;
import java.util.Stack;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Stack<Integer> even = new Stack<Integer>();
		Stack<Integer> odd = new Stack<Integer>();
		
		getIn(scan, even, odd);
		
		while(!even.isEmpty())
			System.out.println("Even: " + even.pop());
		
		while(!odd.isEmpty())
			System.out.println("Odd: " + odd.pop());
	}

	public static void getIn(Scanner scan, Stack<Integer> even, Stack<Integer> odd) {
		
		int num;
		
		System.out.println("Insert ten integers");
		for(int i = 0; i < 10; i++)
		{
			num = scan.nextInt();
			
			if(num == 0)
			{
				if(!even.isEmpty())
					even.pop();
				else
					System.out.println("The stack even is empty");
				
				if(!odd.isEmpty())
					odd.pop();
				else
					System.out.println("The stack odd is empty");
			}
			else
			{
				if(num % 2 == 0)
					even.push(num);
				else
					odd.push(num);
			}
		}
	}
}
