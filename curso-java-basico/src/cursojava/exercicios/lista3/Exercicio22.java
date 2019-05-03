package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Insira a quantidade de CDs que voce comprou");
		int quantidade = scan.nextInt();
		double valorInvestido = 0;
		
		
		for(int i = 1; i <= quantidade; i++)
		{
			System.out.println("Insira o valor do disco" + i);
			valorInvestido += scan.nextDouble();
		}
		
		System.out.println("O valor total investido nessa colecao eh de: R$ " + valorInvestido);
		
		scan.close();
	}

}
