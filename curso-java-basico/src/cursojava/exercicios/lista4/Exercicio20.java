package cursojava.exercicios.lista4;

public class Exercicio20 {

	public static void main(String[] args) {

		double[] a = new double[20];
		double cotacao = 3.96;
		
		for(int i = 1; i <= 20; i++)
		{
			a[i - 1] = i * cotacao;
			System.out.printf("A[%d] = %.2f\n", i, a[i - 1]);
		}
	}
}
