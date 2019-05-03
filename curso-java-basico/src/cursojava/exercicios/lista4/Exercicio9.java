package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		float[] c = new float[10];
		
		System.out.println("Preencha o array A[i] com dez elementos");
		
		for(int i = 0; i < 10; i++)
			a[i] = scan.nextInt();
		
		System.out.println("Preencha o array B[i] com dez elementos");
		
		for(int i = 0; i < 10; i++)
		{
			b[i] = scan.nextInt();
			c[i] = a[i] / (float) b[i];
		}
		
		for(int i = 0; i < 10; i++)
			System.out.println("A[" + i + "] = " + a[i] + " B[" + i +"] = " + b[i] + " C[" + i +"] = " + c[i]);
		
		scan.close();
	}

}
