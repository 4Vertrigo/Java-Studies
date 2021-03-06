package courseADTs.vector.exercises;

import java.util.ArrayList;

import courseADTs.vector.Contact;

public class MainArrayList {

	public static void main(String[] args) {
		
		ArrayList<Contact> vector = new ArrayList<Contact>();
		
		Contact c;
		StringBuilder name = new StringBuilder();
		StringBuilder phone = new StringBuilder();
		StringBuilder email = new StringBuilder();
		
		for(int i = 0; i < 30; i++)
		{
			name.append("Contato");
			name.append(i);
			
			phone.append(i);
			phone.append("2345-6789");
			
			email.append("contato");
			email.append(i);
			email.append("@usp.br");
			
			c = new Contact(name.toString(), phone.toString(), email.toString());
			vector.add(c);
			
			name.setLength(0);
			phone.setLength(0);
			email.setLength(0);
		}
		
		Contact c1 = new Contact("Contact", "234-4567", "contact@email.com");
		
		vector.add(c1);
		vector.add(0, c1);
		
		System.out.println(vector);
		
		boolean exists = vector.contains(c1);
		
		if(exists)
			System.out.println("Element exists in array");
		else
			System.out.println("Element doesn't exist in array");
		
		int pos = vector.indexOf(c1);
		
		if(pos > -1)
			System.out.println("Element exists in array in position " + pos);
		else
			System.out.println("Element doesn't exist in array");
		
		
		System.out.println(vector.get(2));
		
		vector.remove(0);
		vector.remove(c1);
		
		System.out.println(vector);
		System.out.println(vector.size());
		
		System.out.println(vector);
	}

}
