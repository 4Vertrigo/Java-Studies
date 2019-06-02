package courseADTs.stack;

import courseADTs.base.StaticStruct;

public class MyStack<T> extends StaticStruct<T> {

	public MyStack() {
		super();
	}
	
	public MyStack(int capacity) {
		super(capacity);
	}
	
	public void push(T element) {
		super.add(element);
	}
	
	public T pop() {
		
		if(super.isVoid())
			return null;
		
		return this.elements[--super.size];
	}
	
	public T top() {
		
		if(super.isVoid())
			return null;
		
		return this.elements[super.size - 1];
	}
}
