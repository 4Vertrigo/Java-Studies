package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira dois numeros:");
		
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		
		if(valor1 > valor2)
			System.out.print(valor1);
		else if(valor2 > valor1)
			System.out.print(valor2);
		else
			System.out.println("Os numeros sao iguais");
		
		scan.close();
	}
}
