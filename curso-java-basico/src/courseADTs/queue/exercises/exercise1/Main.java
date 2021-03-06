package courseADTs.queue.exercises.exercise1;

import java.util.Scanner;

import courseADTs.queue.exercises.MyPriorityQueue;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MyPriorityQueue<Documents> queue = new MyPriorityQueue<Documents>();
		Documents[] docs = new Documents[10];
		
		getIn(docs, scan);
		inqueue(queue, docs);
		
		
		scan.close();
	}
	
	public static void getIn(Documents[] docs, Scanner scan) {
		
		String name;
		int numPages;
		
		System.out.println("Insert the name and the number of pages of 10 documents");
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Name: ");
			name = scan.nextLine();
			System.out.print("Number of pages: ");
			numPages = scan.nextInt();
			scan.nextLine();
			
			docs[i] = new Documents(name, numPages);
		}
	}
	
	public static void inqueue(MyPriorityQueue<Documents> queue, Documents[] docs) {
		
		for(int i = 0; i < 10; i++)
			queue.enqueue(docs[i]);
		
		System.out.println(queue);
		
		for(int i = 0; i < 10; i++)
			System.out.println(queue.dequeue());
	}
	

}
