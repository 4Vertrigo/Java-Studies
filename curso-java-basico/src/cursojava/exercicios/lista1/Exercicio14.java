package cursojava.exercicios.lista1;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo (em MB)");
		double tamanho = scan.nextDouble();
		System.out.println("Informe a velocidade da internet (em Mbps)");
		double velocidade = scan.nextDouble();
		
		double tempo = tamanho/velocidade;
		int tempoMinutos = (int) Math.ceil(tempo/60);
		
		System.out.printf("O arquivo demorara aproximadamente %d minutos para baixar", tempoMinutos);
		
		scan.close();
	}

}
