package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um numero");
		int numero = scan.nextInt();
		
		if(numero > 0)
			System.out.print("O numero eh positivo");
		else if(numero < 0)
			System.out.print("O numero eh negativo");
		else
			System.out.println("O numero eh neutro");
		
		scan.close();
	}

}
