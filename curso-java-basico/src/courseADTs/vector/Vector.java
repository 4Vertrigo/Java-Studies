package courseADTs.vector;

public class Vector {
	
	private String[] elements;
	private int realSize;

	public Vector(int size) {
		this.elements = new String[size];
		this.realSize = 0;
	}
	
	//inefficient method
	/*public void add(String element) {
		
		for(int i = 0; i < this.elements.length; i++)
		{
			if(this.elements[i] == null)
			{
				this.elements[i] = element;
				break;
			}
		}
	}*/
	
	
	private void changeCapacity(int value) {
		
		//if(this.realSize == this.elements.length) i'm implementing 
		//{
			String[] newElements = new String[this.elements.length + value];
			for(int i = 0; i < this.realSize; i++)
				newElements[i] = this.elements[i];
			
			this.elements = newElements;
		//}
	}
	
	public void add(String element){
		
		//if(this.realSize <= this.elements.length)
		//{
			changeCapacity(1);
			this.elements[this.realSize] = element;
			this.realSize++;
			return;
		//}
		
		//throw new Exception("Vector have been full already");
	}
	
	public void add(int pos, String element) {
		
		if(pos >= 0 && pos < this.realSize)
		{
			changeCapacity(1);
			//shifiting elements
			for(int i = this.realSize - 1; i >= pos; i--)
				this.elements[i+1] = this.elements[i];
			
			this.elements[pos] = element;
			this.realSize++;
			return;
		}
		
		throw new IllegalArgumentException("Invalid position");
	}
	
	public void remove(int pos) {
		
		if(pos >= 0 && pos < this.realSize)
		{
			//shifiting elements
			for(int i = pos; i < this.realSize - 1; i++)
				this.elements[i] = this.elements[i + 1];
			
			this.realSize--;
			changeCapacity(-1);
			return;
		}
		
		throw new IllegalArgumentException("Invalid position");
	}
	
	public int length() {
		return this.realSize;
	}
	
	public String search(int pos){
		
		if(pos >= 0 && pos < this.realSize)
			return this.elements[pos];
		
		throw new IllegalArgumentException("Invalid position");
	}
	
	public int search(String element){
		
		for(int i = 0; i < this.realSize; i++)
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
		
		for(int i = 0; i < this.realSize - 1; i++)
		{
			s.append(this.elements[i]);
			s.append(", ");
		}
		
		if(this.realSize > 0)
			s.append(this.elements[this.realSize - 1]);
		
		s.append("]");
		
		return s.toString();
	}
}
