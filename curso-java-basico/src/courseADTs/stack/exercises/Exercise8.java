package courseADTs.stack.exercises;

import java.util.Stack;

public class Exercise8 {

	public static void main(String[] args) {

		Stack<Integer> origin = new Stack<>();
		Stack<Integer> dest = new Stack<>();
		Stack<Integer> aux = new Stack<>();
		
		origin.push(3);
		origin.push(2);
		origin.push(1);
		
		System.out.println(origin.size());
		
		hanoiTower(origin.size(), origin, dest, aux);
		
		System.out.println(origin);
		System.out.println(dest);
		System.out.println(aux);
	}
	
	public static void hanoiTower(int n, Stack<Integer> origin, Stack<Integer> dest, Stack<Integer> aux) {
		
		if(n > 0)
		{
			hanoiTower(n-1, origin, aux, dest);
			dest.push(origin.pop());
			hanoiTower(n-1, aux, dest, origin);
		}

	}

}
