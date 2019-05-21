package cursojava.exercicios.lista5;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int pares = 0;
		int impares = 0;
		
		System.out.println("Preencha a matriz 3x3:");
		
		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz[i].length; j++)
			{
				System.out.print("mat[" + i + "][" + j + "]: ");
				matriz[i][j] = scan.nextInt();
				
				if(matriz[i][j] % 2 == 0)
					pares++;
				else
					impares++;
			}
		}
		
		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz[i].length; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.print("\n");
		}
		
		System.out.println("O numero de pares eh: " + pares);
		System.out.println("O numero de impares eh: " + impares);
		
		scan.close();
	}

}