package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		char[] b = new char[10];
		
		System.out.println("Preencha o array com dez elementos");
		
		for(int i = 0; i < 10; i++)
		{
			a[i] = scan.nextInt();
			
			if(a[i] < 7)
				b[i] = 'a';
			else if(a[i] == 7)
				b[i] = 'b';
			else if(a[i] < 10)
				b[i] = 'c';
			else if(a[i] == 10)
				b[i] = 'd';
			else
				b[i] = 'e';
		}
		
		for(int i = 0; i < 10; i++)
			System.out.println("A[" + i + "] = " + a[i] + " B[" + i +"] = " + b[i]);
		
		
		scan.close();
	}

}
