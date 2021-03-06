package courseADTs.vector;

public class MainList {

	public static void main(String[] args) {

		List<String> vector = new List<String>();
		
		vector.add("Jonas");
		
		System.out.println(vector);
		System.out.println(vector.search(0));
		
		List<Contact> vector2 = new List<Contact>();
		
		Contact c1 = new Contact("Contact1", "1234-4567", "Contact1@email.com");
		Contact c2 = new Contact("Contact2", "2345-4567", "Contact2@email.com");
		Contact c3 = new Contact("Contact3", "3456-4567", "Contact3@email.com");
		Contact c4 = new Contact("Contact3", "3456-4567", "Contact3@email.com");
		
		vector2.add(c1);
		vector2.add(c2);
		vector2.add(c3);
		
		System.out.println(vector2.length());
		System.out.println(vector2);
		
		try {
			vector2.remove(0);	
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(vector);
		
		try {
			vector2.search(c4);
			System.out.println("Element exists!");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
