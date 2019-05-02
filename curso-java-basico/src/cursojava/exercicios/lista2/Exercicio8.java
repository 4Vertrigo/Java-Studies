package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o preco de tres produtos");
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if(num1 < num2 && num1 < num3)
			System.out.println("Voce deve comprar o primeiro produto");
		else if(num2 < num3)
			System.out.println("Voce deve comprar o segundo produto");
		else
			System.out.println("Voce deve comprar o terceiro produto");
		
		scan.close();
	}

}
