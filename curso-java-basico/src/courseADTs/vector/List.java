package courseADTs.vector;

public class List<T> {
	
	private T[] elements;
	private int size;

	public List() {
		this.elements = (T[]) new Object[0];
		this.size = 0;
	}
	
	private void changeCapacity(int value) {
		
		T[] newElements = (T[]) new Object[this.elements.length + value];
		for(int i = 0; i < this.size; i++)
			newElements[i] = this.elements[i];
		
		this.elements = newElements;
	}
	
	public void add(T element){
		
		changeCapacity(1);
		this.elements[this.size] = element;
		this.size++;
		return;
	}
	
	public void add(int pos, T element) {
		
		if(pos >= 0 && pos < this.size)
		{
			changeCapacity(1);
			for(int i = this.size - 1; i >= pos; i--)
				this.elements[i+1] = this.elements[i];
			
			this.elements[pos] = element;
			this.size++;
			return;
		}
		
		throw new IllegalArgumentException("Invalid position");
	}
	
	public void remove(int pos) {
		
		if(pos >= 0 && pos < this.size)
		{
			for(int i = pos; i < this.size - 1; i++)
				this.elements[i] = this.elements[i + 1];
			
			this.size--;
			changeCapacity(-1);
			return;
		}
		
		throw new IllegalArgumentException("Invalid position");
	}
	
	public int length() {
		return this.size;
	}
	
	public T search(int pos){
		
		if(pos >= 0 && pos < this.size)
			return this.elements[pos];
		
		throw new IllegalArgumentException("Invalid position");
	}
	
	public int search(T element){
		
		for(int i = 0; i < this.size; i++)
		{
			if(this.elements[i].equals(element))
				return i;
		}
		
		throw new IllegalArgumentException("This element doesn't exists in vector");
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
