package cursojava.aulas.aula22;

public class Downcastings {

	public static void main(String[] args) {

		Object obj1 = obterString();
		String s1 = (String) obj1; //downcast com sucesso, uma string em uma string
		
		Object obj2 = "Minha String";
		String s2 = (String) obj2;
		
		Object obj3 = new Object();
		String s3 = (String) obj3; //downcast com erro, a classe object contem muito mais informacoes que nao cabem na classe string
	}
	
	public static String obterString() {
		return "minha string";
	}

}