package courseADTs.set;

import java.util.Set;
import java.util.TreeSet;

public class NiceSet {

	public static void main(String[] args) {
		
		//Set<String> people = new HashSet<>(); It doesn't respect any order
		//Set<String> people = new LinkedHashSet<>(); It respects the insertion order
		Set<String> people = new TreeSet<>(); //It respects the ascending order
		
		
		people.add("Jonas");
		people.add("Maria");
		people.add("Rafael");
		people.add("Joao");
		people.add("Rafael");
		
		for(String name : people) {
			System.out.println(name);
		}
	}

}
