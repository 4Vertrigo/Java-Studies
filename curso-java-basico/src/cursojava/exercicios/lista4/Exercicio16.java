package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int soma = 0;
		int quantidade = 0;
		int quantidadeMaiores15 = 0;
		float media = 0;
		
		System.out.println("Preencha o array com dez elementos");
		
		for(int i = 0; i < 10; i++)
		{
			a[i] = scan.nextInt();
			
			if(a[i] < 15)
				soma += a[i];
			else if(a[i] == 15)
				quantidade++;
			else
			{
				media += a[i];
				quantidadeMaiores15++;
			}
		}
		
		if(quantidadeMaiores15 > 0)
			media /= (float) quantidadeMaiores15;
		
		System.out.println("A soma dos elementos menores que 15 neste vetor eh = " + soma);
		System.out.println("A quantidade de elementos iguais a 15 neste vetor eh = " + quantidade);
		System.out.println("A media dos elementos maiores que 15 neste vetor eh = " + media);
		
		scan.close();
	}

}
