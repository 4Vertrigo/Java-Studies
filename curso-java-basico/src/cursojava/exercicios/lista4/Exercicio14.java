package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		float media = 0;
		int quantidade = 0;
		
		System.out.println("Preencha o array com dez elementos");
		
		for(int i = 0; i < 10; i++)
		{
			a[i] = scan.nextInt();
			
			if(a[i] % 2 != 0)
			{
				media += a[i];
				quantidade++;
			}
		}
		
		if(quantidade != 0) //tratando a divisao por 0
			media /= (float) quantidade;
		
		System.out.println("A media final eh = " + media);
		scan.close();
	}

}
