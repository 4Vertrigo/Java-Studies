package courseADTs.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NiceMap {

	public static void main(String[] args) {

		Map<Integer, String> registredPeople = new HashMap<>();
		
		registredPeople.put(1, "Pedro");
		registredPeople.put(2, "Ana");
		registredPeople.put(3, "Bia");
		registredPeople.put(4, "Carlos");
		
		
		System.out.println(registredPeople.keySet());
		System.out.println(registredPeople.values());
		System.out.println(registredPeople.entrySet());
		
		registredPeople.put(3, "Beatriz");
		System.out.println(registredPeople.get(3));
		
		System.out.println(registredPeople.containsKey(4));
		System.out.println(registredPeople.containsValue("Bia"));
		
		
		System.out.println("Keys...");
		
		for(Integer key : registredPeople.keySet())
			System.out.println(key);
		
		System.out.println("Values...");
		for(String names : registredPeople.values())
			System.out.println(names);
		
		System.out.println("Keys/Values...");
		for(Entry<Integer, String> register : registredPeople.entrySet())
			System.out.println(register.getKey() + " " + register.getValue());
		
		
	}

}
