package cursojava.exercicios.lista1;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira quantos graus Celsius esta la fora hoje:");
		double celsius = scan.nextDouble();
		
		double farenheit = ((9 * celsius)/5) + 32;
		
		System.out.printf("Entao esta %.2f graus Farenheit", farenheit);
		
		scan.close();
	}

}