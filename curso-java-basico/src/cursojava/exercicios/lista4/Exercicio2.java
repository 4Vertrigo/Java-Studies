package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[8];
		int[] b = new int[8];
		
		System.out.println("Preencha o array com oito elementos");
		
		for(int i = 0; i < 8; i++)
		{
			a[i] = scan.nextInt();
			b[i] = 2 * a[i];
		}
		
		for(int i = 0; i < 8; i++)
			System.out.println("A[" + i + "] = " + a[i] + " B[" + i +"] = " + b[i]);
		
		scan.close();
	}

}
