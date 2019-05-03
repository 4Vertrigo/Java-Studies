package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		System.out.println("Preencha o array A[i] com dez elementos");
		
		for(int i = 0; i < 10; i++)
			a[i] = scan.nextInt();
		
		System.out.println("Preencha o array B[i] com dez elementos");
		
		for(int i = 0; i < 10; i++)
		{
			b[i] = scan.nextInt();
			
			if(a[i] > b[i])
				c[i] = 1;
			else if(a[i] == b[i])
				c[i] = 0;
			else
				c[i] = -1;
		}
		
		for(int i = 0; i < 10; i++)
			System.out.println("A[" + i + "] = " + a[i] + " B[" + i +"] = " + b[i] + " C[" + i +"] = " + c[i]);
		
		scan.close();
	}

}
