package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int soma = 0;
		
		System.out.println("Preencha o array com dez elementos");
		
		for(int i = 0; i < 10; i++)
		{
			a[i] = scan.nextInt();
			soma += a[i];
		}
		
		System.out.println("Soma final = " + soma);
		scan.close();
	}

}
