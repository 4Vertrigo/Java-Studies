package cursojava.exercicios.lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int val1;
		int val2;
		
		System.out.println("Digite dois numeros: ");
		val1 = scan.nextInt();
		val2 = scan.nextInt();
		System.out.println("A soma deles eh: " + (val1 + val2)); //nao se esqueca do parenteses para somar e nao apenas imprimir um do lado do outro
		
		scan.close();
	}

}
