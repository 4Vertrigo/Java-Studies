package courseADTs.queue.exercises;

public class MyPriorityQueue<T> extends MyQueue<T> {
	
	public MyPriorityQueue() {
		super();
	}
	
	public MyPriorityQueue(int capacity) {
		super(capacity);
	}
	
	public void enqueue(T element) {
		
		Comparable<T> key = (Comparable<T>) element;
		
		int i = 0;
		
		for(i = 0; i < this.size; i++)
			if(key.compareTo(this.elements[i]) < 0)
				break;
		
		super.add(i, element);
	}

}
