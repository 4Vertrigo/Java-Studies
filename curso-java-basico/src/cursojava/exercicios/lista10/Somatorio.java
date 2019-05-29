package cursojava.exercicios.lista10;

public class Somatorio {

	public static int calculo(int n) {
		
		if(n == 1)
			return 1;
		
		return n + calculo(n-1);
	}
}
