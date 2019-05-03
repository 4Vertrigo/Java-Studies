package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira dois numeros!");
		int maior = scan.nextInt();
		int menor = scan.nextInt();
		int soma = 0;
		
		if(menor > maior)
		{
			int aux = maior;
			maior = menor;
			menor = aux;
		}
		
		System.out.println("O intervalo entre " + menor + " e " + maior + " sao os seguintes numeros:");
		
		for(int i = menor + 1; i < maior; i++)
		{
			System.out.print(i);
			soma += i;
				
			if(i != maior - 1)
				System.out.print(" ");
			else
				System.out.print("\n");
		}
		
		System.out.println("A soma deles eh: " + soma);
		
		scan.close();
	}

}
