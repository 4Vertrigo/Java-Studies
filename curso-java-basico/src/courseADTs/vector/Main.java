package courseADTs.vector;

public class Main {

	public static void main(String[] args) {

		Vector vector = new Vector(0);
		
		vector.add("A");
		vector.add("B");
		vector.add("C");
		vector.add("D");
		vector.add("E");
		vector.add("F");
		
		System.out.println(vector.length());
		System.out.println(vector);
		
		try
		{
			System.out.println(vector.search(-1));
		}
		
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try
		{
			System.out.println(vector.search("Worlda"));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			vector.add(1, "*");
			vector.add(3, "+");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(vector);
		try
		{
			vector.remove(-1);
			vector.remove(-1);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(vector);
		System.out.println(vector.length());
	}

}
