package cursojava.aulas.aula17;

public class Recursividade {
	
	public static int fatorial(int num) {
		
		if(num == 0)
			return 1;
		
		return num * fatorial(num-1);
	}
	
}
