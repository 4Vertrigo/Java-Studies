package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tres numeros");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3)
			System.out.println("O maior numero eh: " + num1);
		else if(num2 > num3)
			System.out.println("O maior numero eh: " + num2);
		else
			System.out.println("O maior numero eh: " + num3);
		
		if(num1 < num2 && num1 < num3)
			System.out.println("O menor numero eh: " + num1);
		else if(num2 < num3)
			System.out.println("O menor numero eh: " + num2);
		else
			System.out.println("O menor numero eh: " + num3);
		
			
		scan.close();
	}
}
