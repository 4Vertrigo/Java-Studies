package cursojava.exercicios.lista1;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira quantos graus Farenheit esta la fora hoje:");
		double farenheit = scan.nextDouble();
		
		double celsius = (5 * (farenheit - 32))/9;
		
		System.out.printf("Entao esta %.2f graus Celsius", celsius);
		
		scan.close();
	}

}