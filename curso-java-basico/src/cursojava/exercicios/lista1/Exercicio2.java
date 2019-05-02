package cursojava.exercicios.lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = scan.nextInt();
		System.out.println("O numero informado foi: " + num);
		
		scan.close();
	}

}
