package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a base");
		int base = scan.nextInt();
		
		System.out.println("Insira o expoente");
		int expoente = scan.nextInt();
		
		int resultado = 1;
		
		for(int i = 0; i < expoente; i++)
		{
			resultado *= base;
		}
		
		if(base != 0 && expoente != 0)
			System.out.println("O resultado dessa potencia eh: " + resultado);
		else
			System.out.println("Indeterminacao matematica");
		scan.close();
	}

}