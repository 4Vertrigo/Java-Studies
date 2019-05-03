package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		int media = 0;
		
		
		System.out.println("Insira cinco numero");
		for(int i = 0; i < 5; i++)
			soma += scan.nextInt();
		
		media = soma / 5;
		
		System.out.println("A soma eh: " + soma);
		System.out.println("A media eh: " + media);
		
		scan.close();
	}

}
