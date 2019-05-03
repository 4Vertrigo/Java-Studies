package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		
		System.out.println("Preencha o array com dez elementos");
		
		for(int i = 0; i < 10; i++)
			a[i] = scan.nextInt();
				
		for(int i = 0; i < 10; i++)
		{
			System.out.print("A[" + i + "] = " + a[i] + " ( ");
			
			for(int j = 0; j < a[i]; j += 2)
				System.out.print(j + " ");
			
			System.out.println(")");
		}
		
		scan.close();
	}

}
