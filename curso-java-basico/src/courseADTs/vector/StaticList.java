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

}
