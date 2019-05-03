package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int quantidade = 0;
		
		System.out.println("Insira a idade de dez pesoas no array");
		
		for(int i = 0; i < 10; i++)
			a[i] = scan.nextInt();
		
		for(int i = 0; i < 10; i++)
		{
			if(a[i] > 35)
				quantidade++;
		}
		
		System.out.println("Quantidade de pessoas com mais de 35 no array: " + quantidade);
		scan.close();
	}

}
