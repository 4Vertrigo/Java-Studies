package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int quantidadePares = 0;
		int quantidadeImpares = 0;
		
		System.out.println("Preencha o array com dez elementos");
		
		for(int i = 0; i < 10; i++)
		{
			a[i] = scan.nextInt();
			
			if(a[i] % 2 == 0)
				quantidadePares++;
			else
				quantidadeImpares++;
			
		}
		
		//so funciona no caso especifico de a.lenght = 10
		quantidadePares *= 10;
		quantidadeImpares *= 10;
		
		System.out.println("Porcentagem de numeros pares no vetor = " + quantidadePares + "%");
		System.out.println("Porcentagem de numeros impares no vetor = " + quantidadeImpares + "%");
		scan.close();
	}

}
