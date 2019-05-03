package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira quantas notas voce deseja saber a media");
		int n = scan.nextInt();
		double notas = 0;
		
		System.out.println("Insira as notas a baixo");
		for(int i = 0; i < n; i ++)
			notas += scan.nextInt();
		
		notas /= n;
		
		System.out.println("A media final eh: " + notas);
		
		scan.close();
	}
}
