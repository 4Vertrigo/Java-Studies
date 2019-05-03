package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		
		System.out.println("Preencha o array com dez elementos");
		
		for(int i = 0; i < 10; i++)
		{
			a[i] = scan.nextInt();
			
			if(a[i] % 2 == 0)
				b[i] = 1;
			else
				b[i] = 0;
		}
		
		for(int i = 0; i < 10; i++)
			System.out.println("A[" + i + "] = " + a[i] + " B[" + i +"] = " + b[i]);
		
		
		scan.close();
	}

}
