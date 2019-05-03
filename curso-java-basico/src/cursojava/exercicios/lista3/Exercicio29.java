package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//implementaremos o exercicio a seguir usando o crivo de erastotenes
		
		System.out.println("Insira o valor limite que deseja saber de numeros primos");
		int max = scan.nextInt();
		
		int[] lista = new int[max - 1]; //mostraremos a partir do 2
		
		int valorLimite = (int) Math.floor(Math.sqrt(max)); //descobrindo o ultimo divisor do crivo
		
		
		for(int i = 2, j = 0; i <= max; i++, j++) //preencendo a lista que sera mostrada ao usuario
			lista[j] = i;
		
		int j = 0;
		int i = 1;
		
		while(lista[j] <= valorLimite) //removendo os indices nao primos dessa lista
		{
			while(i < max - 1)
			{
				if(lista[i] % lista[j] == 0)
					lista[i] = -1; //metodo pra remover elementos
				i++;
			}
			
			do
				j++;
			while(lista[j] == -1); ///esse laco obtem ate o proximo primo que nao precisa realizar no crivo
			
			i = j + 1;
		}
		
		for(i = 0; i < max - 2; i++)
		{
			if(lista[i] != -1)
				System.out.println(lista[i]);
		}
		
		scan.close();
	}

}
