package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero que se deseja saber o fatorial");
		int num = scan.nextInt();
		int aux = num;
		
		for(int i = num - 1; i >= 1; i--)
			num *= i;
		
		System.out.println(aux + "!" + " = " + num);
		
		scan.close();
	}

}
