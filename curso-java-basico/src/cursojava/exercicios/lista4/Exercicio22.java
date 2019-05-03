package cursojava.exercicios.lista4;

public class Exercicio22 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int quantidade1 = 0;
		int quantidade0 = 0;
		
		for(int i = 0; i < 10; i++)
		{
			a[i] = (int) Math.round(Math.random() * 1);
			
			if(a[i] == 0)
				quantidade0++;
			else
				quantidade1++;
		}
		
		quantidade0 *= 10;
		quantidade1 *= 10;
		
		System.out.println("Porcentagem de 0 no vetor: " + quantidade0 + "%");
		System.out.println("Porcentagem de 1 no vetor: " + quantidade1 + "%");
	}

}
