package cursojava.exercicios.lista3;

public class Exercicio4 {

	public static void main(String[] args) {

		int populacaoA = 80000;
		int populacaoB = 200000;
		int ano = 0;
		
		while(populacaoA <= populacaoB)
		{
			populacaoA += (populacaoA * 0.03);
			populacaoB += (populacaoB * 0.015);
			ano++;
			
			System.out.println("Estamos no ano " + ano + " e as populacoes estao assim:");
			System.out.println("Populacao do pais A " + populacaoA + " Populacao do pais B " + populacaoB);
		}
	}

}
