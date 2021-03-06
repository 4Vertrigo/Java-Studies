package courseADTs.vector.exercises;

public class Main {

	public static void main(String[] args) {
		
		List<Contact> vector = new List<Contact>();
		
		
		Contact c = new Contact("Jonas", "(11) 9751-5126", "jonas_wendel@usp.br");
		
		for(int i = 0; i < 30; i++)
		{
			vector.add(c);
		}
		
		exists(vector, c);
		
		System.out.println(vector.lastIndexOf(c));
		
		vector.remove(c);
		
		System.out.println(vector);
		
		try {
			System.out.println(vector.get(2));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		vector.clear();
		
		System.out.println(vector);
		System.out.println(vector.length());
	}
	
	public static void exists(List<Contact> vector, Contact element)
	{
		if(vector.contains(element))
			System.out.println("Element exists in array");
		else
			System.out.println("Element doesn't exist in array");
	}
}
