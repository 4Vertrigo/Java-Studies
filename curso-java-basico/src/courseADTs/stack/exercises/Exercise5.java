package courseADTs.stack.exercises;

import java.util.Scanner;
import java.util.Stack;

public class Exercise5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean isPalindrome = true;
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		
		System.out.println("Insert a word to see if it is a palindrome");
		String palindrome = scan.nextLine();
		
		for(int i = 0, j = palindrome.length() - 1; i < palindrome.length(); i++, j--)
		{
			stack1.push(palindrome.charAt(i));
			stack2.push(palindrome.charAt(j));
		}
		
		while(!stack1.isEmpty())
		{
			if(!stack1.pop().equals(stack2.pop()))
			{
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome)
			System.out.println("The word is a palindrome");
		else
			System.out.println("The word isn't a palindrome");
		
		
		scan.close();
	}

}
