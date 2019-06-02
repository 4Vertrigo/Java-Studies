package courseADTs.queue.exercises;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		
		createQueues(queue, priorityQueue);
		
		manipuleQueues(queue, priorityQueue);
	}
	
	public static void createQueues(Queue<Integer> queue, Queue<Integer> priorityQueue) {
		
		int[] key = new int[10];
		Random randNum = new Random();
		
		for(int i = 0; i < 10; i++)
		{
			key[i] = randNum.nextInt(50);
			
			if(key[i] % 3 == 0)
				priorityQueue.add(key[i]);
			else
				queue.add(key[i]);
		}
	}
	
	public static void manipuleQueues(Queue<Integer> queue, Queue<Integer> priorityQueue) {
		
		System.out.println("Queue: \n" + queue);
		System.out.println("Priority queue: \n" + priorityQueue);
		
		int contPriority = 0;
		
		while(!queue.isEmpty())
		{
			if(!priorityQueue.isEmpty() && contPriority < 3)
			{
				System.out.println("Priority queue: " + priorityQueue.remove());
				contPriority++;
			}
			
			else
			{
				System.out.println("Queue: " + queue.remove());
				contPriority = 0;
			}
		}
	}
}
