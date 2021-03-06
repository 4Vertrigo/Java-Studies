package deepeningFundamentals;

public class Strings {

	public static void main(String[] args) {

		String name = new String("Leonardo");
		
		name = "Leo" + "nardo";
		
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
		System.out.println(name.substring(0, 3));
		System.out.println(name.indexOf('d'));
		System.out.println(name.charAt(6));
		System.out.println(name.equalsIgnoreCase("leonardo"));
		System.out.println(name.startsWith("Leo"));
		System.out.println(name.isEmpty());
		System.out.println(name.concat(" is cool").concat("!"));
		
		//String is immutable!
		
		System.out.println(name);
		
		name = name.toUpperCase().substring(0, 3).concat(" is cool!");
		
		
		//TO CONCATENATE STRINGS
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Joao");
		sb.append(",").append("Maria");
		sb.append(",").append("Pedro");
		
		//StringBuilder is mutable!
		
		sb.reverse();
		
		System.out.println(sb.toString());
		System.out.println(sb.substring(1, 3)); //It doesn't change the stringbuilder
		System.out.println(sb.toString());
	}

}
