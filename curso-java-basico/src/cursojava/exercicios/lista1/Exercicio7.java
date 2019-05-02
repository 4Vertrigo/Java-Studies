package cursojava.exercicios.lista1;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] Args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a dimensao do seu quadrado:");
		double lado = scan.nextInt();
		double area = Math.pow(lado, 2);
		
		System.out.print("O dobro da area do seu quadrado eh: " + (area * 2));
		
		scan.close();
	}

}
