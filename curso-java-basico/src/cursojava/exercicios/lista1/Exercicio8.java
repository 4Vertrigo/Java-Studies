package cursojava.exercicios.lista1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voce ganha por hora?");
		double salario = scan.nextDouble();
		System.out.println("Quantas horas voce trabalha por dia?");
		int expediente = scan.nextInt();
		
		//supondo que um mes possui 4 semanas, entao sao 20 dias uteis
		
		int expedienteMes = expediente * 20;
		
		System.out.print("Voce trabalha " + expedienteMes + " horas por mes e ganha R$: " + salario * expedienteMes + " por mes");

		scan.close();
	}

}
