package courseADTs.stack.exercises.exercises3;

import java.util.Scanner;

import courseADTs.stack.MyStack;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		MyStack<Book> stack = new MyStack<Book>(20);
		
		insertsInStack(scan, stack);
		
		System.out.println("Element removed: " + stack.pop());
		System.out.println("Top element: " + stack.top());
		System.out.println("Stack size: " + stack.size());
		System.out.println("The stack is empty: " + stack.isVoid());
		System.out.println("The stack: " + stack);
		
	}
	
	public static void insertsInStack(Scanner scan, MyStack<Book> stack) {
		
		Book[] books = new Book[6];
		
		books[0] = new Book("Memorias postumas de Bras Cubas", "1234", "01/01/1881", "Machado de Assis");
		books[1] = new Book("A cidade e as serras", "4321", "05/05/1901", "Eca de Queiroz");
		books[2] = new Book("O Cortico", "3421", "07/07/1890", "Aluisio Azevedo");
		books[3] = new Book("O crime do Padre Amaro", "2314", "09/01/1875", "Eca de Queiroz");
		books[4] = new Book("Vidas secas", "1342", "04/12/1938", "Graciliano Ramos");
		books[5] = new Book("Auto da barca do inferno", "2413", "02/08/1517", "Gil Vicente");
		
		for(int i = 0; i < 6; i++)
			stack.push(books[i]);
	}
}
