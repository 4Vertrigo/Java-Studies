package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		
		System.out.println("Preencha o array com dez elementos");
		
		for(int i = 0; i < 10; i++)
			a[i] = scan.nextInt();
		
		
		for(int i = 0; i < 10; i++)
		{
			if(a[i] % 2 != 0)
			{
				System.out.println("Existem elementos nao pares no array");
				break;
			}
			
			if(i == 9)
				System.out.println("Existem apenas elementos pares no array");
		}
		
		scan.close();
	}

}