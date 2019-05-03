package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int maior = 0;
		int numero;
		
		System.out.println("Insira cinco numero");
		for(int i = 0; i < 5; i++)
		{
			if(i == 0)
				maior = scan.nextInt();
			else
			{
				numero = scan.nextInt();
				if(numero > maior)
					maior = numero;
			}
		}
		
		System.out.println("O maior numero eh: " + maior);
		scan.close();
	}

}
