package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a suas duas notas");
		
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7)
		{
			if(media == 10)
				System.out.print("Aprovado com Distincao");
			else
				System.out.print("Aprovado");
		}
		else
			System.out.print("Reprovado");
		
		scan.close();
	}

}
