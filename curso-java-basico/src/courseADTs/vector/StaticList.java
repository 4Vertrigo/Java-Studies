package courseADTs.vector;

import courseADTs.base.StaticStruct;

public class StaticList<T> extends StaticStruct<T> {
	
	public StaticList() {
		super();
	}
	
	public StaticList(int capacity) {
		super(capacity);
	}
	
	public boolean add(T element) {
		return super.add(element);
	}
	
	public boolean add(int pos, T element) {
		return super.add(pos, element);
	}

	public void remove(int pos) {
		
		super.remove(pos);
	}
	
	public int search(T element){
		
		for(int i = 0; i < this.size; i++)
		{
			if(this.elements[i].equals(element))
				return i;
		}
		
		return -1;
	}
	
	public boolean contains(T element) {
		
		if(this.search(element) > -1)
			return true;
		
		return false;
	}
	
	public int lastIndexOf(T element) {
		
		for(int i = this.size - 1; i >= 0; i--)
		{
			if(this.elements[i].equals(element))
				return i;
		}
		
		return -1;
	}
	
	public void remove(T element) {
		
		int pos = search(element);
		
		if(pos > -1)
		{
			this.remove(pos);
			return;
		}
		
		System.out.println("The element doesn't exist in vector");
	}
	
	public T get(int pos){
		
		if(pos >= 0 && pos < this.size)
			return this.elements[pos];
		
		throw new IllegalArgumentException("Invalid position");
	}
	
	public void clear() {
		
		while(this.size > 0)
			this.remove(0);
	}
	
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.size - 1; i++)
		{
			s.append(this.elements[i]);
			s.append(", ");
		}
		
		if(this.size > 0)
			s.append(this.elements[this.size - 1]);
		
		s.append("]");
		
		return s.toString();
	}

}
