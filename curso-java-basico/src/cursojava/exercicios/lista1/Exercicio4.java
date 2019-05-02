package cursojava.exercicios.lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		System.out.println("Insira as notas:");
		Scanner scan = new Scanner(System.in);
		float nota1 = scan.nextFloat();
		float nota2 = scan.nextFloat();
		float nota3 = scan.nextFloat();
		float nota4 = scan.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A media final eh: " + media);

		scan.close();
	}

}
