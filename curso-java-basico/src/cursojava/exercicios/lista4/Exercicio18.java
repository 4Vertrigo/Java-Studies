package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int maiorIdade = -1;
		int iMaior = 0;
		int menorIdade = 200;
		int iMenor = 0;
		
		System.out.println("Insira a idade de dez pesoas no array");
		
		for(int i = 0; i < 10; i++)
			a[i] = scan.nextInt();
		
		for(int i = 0; i < 10; i++)
		{
			if(a[i] > maiorIdade)
			{
				maiorIdade = a[i];
				iMaior = i;
			}
			
			else if(a[i] < menorIdade)
			{
				menorIdade = a[i];
				iMenor = i;
			}
		}
		
		System.out.println("A maior idade no array eh: " + maiorIdade + " e sua posicao eh: " + iMaior);
		System.out.println("A menor idade no array eh: " + menorIdade + " e sua posicao eh: " + iMenor);
		
		scan.close();
	}

}
