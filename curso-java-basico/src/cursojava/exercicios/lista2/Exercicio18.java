package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um numero para vermos se ele eh par ou impar");
		
		int numero = scan.nextInt();
		
		if(numero % 2 == 0)
			System.out.println("O numero eh par");
		else
			System.out.println("O numero eh impar");
		
		scan.close();
	}

}
