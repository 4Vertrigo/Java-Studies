package courseADTs.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		MyQueue<Integer> queue = new MyQueue<Integer>();
		
		System.out.println(queue);
		System.out.println(queue.size());
		
		for(int i = 1; i <= 10; i++)
			queue.enqueue(i);
		
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.top());
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		
		Queue<Integer> queueAPI = new LinkedList<>(); //queue is a interface
		
		queueAPI.add(1);
		queueAPI.add(2);
		
		System.out.println(queueAPI);
		System.out.println(queueAPI.peek());
		System.out.println(queueAPI.remove());
		System.out.println(queueAPI);
		
		MyPriorityQueue<Integer> priorityQueue = new MyPriorityQueue<>();
		
		priorityQueue.enqueue(3);
		priorityQueue.enqueue(1);
		priorityQueue.enqueue(2);
		
		System.out.println(priorityQueue);
		
		Queue<Integer> priorityQueueAPI = new PriorityQueue<Integer>();
		
		priorityQueueAPI.add(2);
		priorityQueueAPI.add(1);
		
		System.out.println(priorityQueueAPI);
	}

}
