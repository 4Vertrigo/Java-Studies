package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[20];
		
		System.out.println("Preencha o array A[i] com dez elementos");
		
		for(int i = 0; i < 10; i++)
		{
			a[i] = scan.nextInt();
			c[i] = a[i];
		}
		
		System.out.println("Preencha o array B[i] com dez elementos");
		
		for(int i = 0; i < 10; i++)
		{
			b[i] = scan.nextInt();
			c[i + 10] = b[i];
		}
		
		for(int i = 0; i < 10; i++)
			System.out.println("A[" + i + "] = " + a[i] + " B[" + i +"] = " + b[i]);
		
		for(int i = 0; i < 20; i++)
			System.out.println(" C[" + i +"] = " + c[i]);
		
		scan.close();
	}

}
