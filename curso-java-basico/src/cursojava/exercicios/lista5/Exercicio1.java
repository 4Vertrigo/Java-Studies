package cursojava.exercicios.lista5;

public class Exercicio1 {

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];
		int maior = -1;
		int posI = 0;
		int posJ = 0;

		
		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz[i].length; j++)
			{
				matriz[i][j] = (int) Math.round(Math.random() * 9);
				
				if(matriz[i][j] > maior)
				{
					maior = matriz[i][j];
					posI = i;
					posJ = j;
				}
			}
		}
		
		System.out.println("O maior termo da matriz eh: M [" + posI + "][" + posJ + "] = " + maior);
		
		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz[i].length; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.println();
		}
	}

}
