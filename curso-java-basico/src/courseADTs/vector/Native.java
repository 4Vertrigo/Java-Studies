package courseADTs.vector;

import java.util.ArrayList;

public class Native {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		
		System.out.println(arrayList);
		
		arrayList.add(0, 0);
		
		System.out.println(arrayList);
		
		boolean exists = arrayList.contains(1);
		
		if(exists)
			System.out.println("Element exists in array");
		else
			System.out.println("Element doesn't exist in array");
		
		int pos = arrayList.indexOf(2);
		
		if(pos > -1)
			System.out.println("Element exists in array in position " + pos);
		else
			System.out.println("Element doesn't exist in array");
		
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0);
		arrayList.remove((Integer)3);
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		
	}

}
