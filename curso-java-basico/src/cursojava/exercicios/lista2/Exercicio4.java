package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira uma letra");
		
		String opcao = scan.next();
		
		if(opcao.equalsIgnoreCase("a") || 
		opcao.equalsIgnoreCase("e") ||
		opcao.equalsIgnoreCase("i") ||
		opcao.equalsIgnoreCase("o") ||
		opcao.equalsIgnoreCase("u"))
			System.out.print("Eh vogal");
		else
		{
			if(opcao.length() == 1)
				System.out.print("Eh consoante");
			else
				System.out.print("Entrada invalida");
		}

		scan.close();
	}
}
