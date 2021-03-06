package courseADTs.queue.exercises.exercise1;

public class Documents implements Comparable{
	
	private String name;
	private int numPages;
	
	public Documents() {
		// TODO Auto-generated constructor stub
	}

	public Documents(String name, int numPages) {
		this.name = name;
		this.numPages = numPages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	
	public int compareTo(Object o) {
		
		//obj1 > obj2 return 1
		//obj1 < obj2 return -1
		
		if(this.numPages > ((Documents)o).getNumPages())		
			return 1;
		else if(this.numPages < ((Documents)o).getNumPages())		
			return -1;
			
		return 0;
	}

	@Override
	public String toString() {
		return "Documents [name=" + name + ", numPages=" + numPages + "]";
	}

}
