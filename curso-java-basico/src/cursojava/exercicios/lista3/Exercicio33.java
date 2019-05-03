package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de termos:");
		int termos = scan.nextInt();
		double soma = 0;
		
		for(int i = 0; i < termos; i++)
		{
			System.out.print((i + 1) + "/" + ((2 * i) + 1) + " ");
			soma += (double) (i + 1) / (double) ((2 * i) + 1);
		}
		
		System.out.println("\n" + soma);
		scan.close();
	}

}
