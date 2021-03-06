package courseADTs.vector;

public class MainObjects {
	
	public static void main(String[] args) {
		
		VectorObject vector = new VectorObject();
		
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.add("Jonas");
		
		Contact c1 = new Contact("Contact1", "1234-4567", "Contact1@email.com");
		Contact c2 = new Contact("Contact2", "2345-4567", "Contact2@email.com");
		Contact c3 = new Contact("Contact3", "3456-4567", "Contact3@email.com");
		Contact c4 = new Contact("Contact3", "3456-4567", "Contact3@email.com");
		
		vector.add(c1);
		vector.add(c2);
		vector.add(c3);
		
		System.out.println(vector.length());
		System.out.println(vector);
		
		try {
			vector.remove(0);	
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(vector);
		
		try {
			vector.search(c4);
			System.out.println("Element exists!");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	

}
