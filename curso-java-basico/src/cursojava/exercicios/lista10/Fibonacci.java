package cursojava.exercicios.lista10;

public class Fibonacci {

	public static int calculo(int n) {
		
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		return calculo(n - 1) + calculo(n - 2);
	}
}
