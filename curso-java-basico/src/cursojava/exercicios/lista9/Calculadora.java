package cursojava.exercicios.lista9;

public class Calculadora {
	
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtracao(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multipicacao(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double divisao(int num1, int num2) {
		return num1 / (double) num2;
	}
	
	public static int potencia(int num, int n) {
		
		int aux = num;
		num = 1;
		
		for(int i = 0; i < n; i++)
			num *= aux;
		
		return num;
	}
	
	public static int factorial(int num) {
		
		int aux = num - 1;
		
		while(aux > 0)
		{
			num *= aux;
			aux--;
		}
		
		return num;
	}

}
