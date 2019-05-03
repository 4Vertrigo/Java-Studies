package cursojava.exercicios.lista3;

public class Exercicio23 {

	public static void main(String[] args) {

		System.out.println("Lojas Quase Dois - Tabela de precos");
		for(int i = 1; i <= 50; i++)
			System.out.printf("%02d - R$ %.2f\n", i, (1.99 * i));
	}

}
