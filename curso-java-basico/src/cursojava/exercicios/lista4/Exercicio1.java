package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		
		System.out.println("Preencha o array com cinco elementos");
		
		for(int i = 0; i < 5; i++)
		{
			a[i] = scan.nextInt();
			b[i] = a[i];
		}
		
		for(int i = 0; i < 5; i++)
			System.out.println("A[" + i + "] = " + a[i] + " B[" + i +"] = " + b[i]);
		
		
		scan.close();
	}

}
