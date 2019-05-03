package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o preco do pao");
		double preco = scan.nextDouble();
		
		System.out.printf("Preco do pao: R$ %.2f\n", preco);
		System.out.println("Panificadora Pao de ontem - Tabela de precos");
		for(int i = 1; i <= 50; i++)
			System.out.printf("%02d - R$ %.2f\n", i, (preco * i));
		
		scan.close();
	}

}
