package courseADTs.queue.exercises;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Exercise3 {

	public static final int RED = 0;
	public static final int YELLOW = 1;
	public static final int GREEN = 2;
	
	
	public static void main(String[] args) {

		Queue<Integer> queue = new PriorityQueue<>();
		
		initializingQueue(queue);
		hospital(queue);
		
	}
	
	public static void initializingQueue(Queue<Integer> queue){
		
		Random randPriority = new Random();
		
		for(int i = 0; i < 6; i++)
			queue.add(randPriority.nextInt(3));
		
	}
	
	public static void hospital(Queue<Integer> queue) {
		
		int time = 0;
		Random randPriority = new Random();
		int num;
		
		System.out.println(queue);
		
		while(!queue.isEmpty())
		{
			if(time % 4 == 0)
			{
				if(queue.peek() == RED)
					System.out.println("PRIORITY RED IN CARE");
				else if(queue.peek() == YELLOW)
					System.out.println("PRIORITY YELLOW IN CARE");
				else
					System.out.println("PRIORITY GREEN IN CARE");
				
				queue.remove();
				System.out.println(queue);
			}
			
			if(time % 5 == 0)
			{
				num = randPriority.nextInt(3);
				
				if(num == RED)
					System.out.println("PRIORITY RED HAS ARRIVED IN HOSPITAL");
				else if(num == YELLOW)
					System.out.println("PRIORITY YELLOW HAS ARRIVED IN HOSPITAL");
				else
					System.out.println("PRIORITY GREEN HAS ARRIVED IN HOSPITAL");
				
				queue.add(num);
				System.out.println(queue);
			}
			
			time++;
		}
		
		
	}

}
