package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira uma nota de 0 a 10");
		
		double nota = scan.nextDouble();
		
		while(nota < 0 || nota > 10)
		{
			System.out.println("Entrada invalida, por favor, insira um valor entre 0 e 10");
			nota = scan.nextDouble();
		}

		System.out.println("Sua nota eh: "+ nota);
		
		scan.close();
	}

}
