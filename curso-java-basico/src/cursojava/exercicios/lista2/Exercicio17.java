package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um ano:");
		
		int ano = scan.nextInt();
		
		if(ano % 4 == 0)
			System.out.println("O ano eh bissesto");
		else
			System.out.println("O ano nao eh bissesto");
		
		scan.close();
	}
}
