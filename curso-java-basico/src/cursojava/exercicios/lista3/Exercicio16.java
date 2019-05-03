package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long num1 = 1;
		long num2 = 1;
		long termo = 1;
		long aux;
		int i = 2;
		
		//comecando do termo 0
		System.out.println("Digite o N termo limite da sequencia de fibonacci");
		System.out.println("O termo 0 eh igual a: " + 1);
		System.out.println("O termo 1 eh igual a: " + 1);
		
		while(termo < 500)
		{
			termo = num1 + num2;
			aux = num1;
			num1 = termo;
			num2 = aux;
			System.out.println("O termo "+ (i++) +" eh igual a: " + termo);
		}
		
		
		scan.close();
	}

}
