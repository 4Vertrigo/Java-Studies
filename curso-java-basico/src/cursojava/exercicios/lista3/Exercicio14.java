package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int pares = 0;
		int impares = 0;
		int num;
		
		System.out.println("Insira dez numeros");
		
		for(int i = 0; i < 10; i++)
		{
			num = scan.nextInt();
			
			if(num % 2 == 0)
				pares++;
			else
				impares++;
		}
		
		System.out.println("A quantidade de numeros pares foi: " + pares);
		System.out.println("A quantidade de numeros impares foi: " + impares);
		
		scan.close();
	}

}
