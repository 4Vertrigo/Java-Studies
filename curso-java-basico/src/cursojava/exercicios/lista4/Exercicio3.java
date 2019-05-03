package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[15];
		int[] b = new int[15];
		
		System.out.println("Preencha o array com quinze elementos");
		
		for(int i = 0; i < 15; i++)
		{
			a[i] = scan.nextInt();
			b[i] = a[i] * a[i];
		}
		
		for(int i = 0; i < 15; i++)
			System.out.println("A[" + i + "] = " + a[i] + " B[" + i +"] = " + b[i]);
		
		scan.close();
	}

}
