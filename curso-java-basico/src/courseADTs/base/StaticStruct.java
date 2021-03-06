package courseADTs.base;

public class StaticStruct<T> {
	
	protected T[] elements;
	protected int size;
	
	public StaticStruct(int capacity) {
		
		elements = (T[]) new Object[capacity];
		size = 0;
	}
	
	public StaticStruct() {
		this(10);
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isVoid() {
		if (this.size == 0)
			return true;
		return false;
	}
	
	protected void increaseCapacity() {
		
		if(this.size == this.elements.length)
		{
			T[] newElements = (T[]) new Object[this.elements.length * 2];
			for(int i = 0; i < this.elements.length; i++)
				newElements[i] = this.elements[i];
			
			this.elements = newElements;
		}
	}
	
	protected boolean add(T element){
		
		this.increaseCapacity();
		if(this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		return false;
	}
	
	protected boolean add(int pos, T element) {
		
		if (pos < 0 || pos > this.size)
			throw new IllegalArgumentException("Posição inválida");

		this.increaseCapacity();

		//mover todos os elementos
		for (int i = this.size-1; i >= pos; i--)
			this.elements[i+1] = this.elements[i];
		
		this.elements[pos] = element;
		this.size++;

		return true;
	}
	
	protected void remove(int pos) {
		
		if(pos >= 0 && pos < this.size)
		{
			for(int i = pos; i < this.size - 1; i++)
				this.elements[i] = this.elements[i + 1];
			
			this.size--;
			return;
		}
		
		throw new IllegalArgumentException("Invalid position");
	}
	
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
