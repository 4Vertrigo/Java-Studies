package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long num1 = 1;
		long num2 = 1;
		long termo = 1;
		long aux;
		
		//comecando do termo 0
		System.out.println("Digite o N termo limite da sequencia de fibonacci");
		long n = scan.nextLong();
		System.out.println("O termo 0 eh igual a: " + 1);
		System.out.println("O termo 1 eh igual a: " + 1);
		
		for(int i = 1; i < n; i++)
		{
			termo = num1 + num2;
			aux = num1;
			num1 = termo;
			num2 = aux;
			System.out.println("O termo "+ (i+1) +" eh igual a: " + termo);
		}
		
		
		scan.close();
	}

}