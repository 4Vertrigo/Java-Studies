package courseADTs.queue;

import courseADTs.base.StaticStruct;

public class MyQueue<T> extends StaticStruct<T>{
	
	public MyQueue() {
		super();
	}
	
	public MyQueue(int capacity) {
		super(capacity);
	}
	
	public void enqueue(T element) {
		super.add(element);
	}
	
	public T dequeue() {
		
		if(super.isVoid())
			return null;
		
		T element = (T) new Object();
		element = super.elements[0];
		
		super.remove(0);
		
		return element;
	}
	
	public T top() {
		
		if(super.isVoid())
			return null;
		
		return this.elements[0];
	}

}
