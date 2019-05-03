package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double temperatura;
		double maior = 0;
		double menor = 0;
		double media = 0;
		boolean condicao = true;
		String opcao;
		int i = 1;
		
		
		while(condicao)
		{
			System.out.println("Insira a temperatura " + i);
			
			temperatura = scan.nextDouble();
			
			if(i == 1)
			{
				maior = temperatura;
				menor = temperatura;
			}
			
			else
			{
				if(temperatura > maior)
					maior = temperatura;
				
				else if(temperatura < menor)
					menor = temperatura;
			}
			
			media += temperatura;
			
			while(true)
			{
				System.out.println("Voce deseja inserir mais alguma temperatura? Digite 'Sim' ou 'Nao'");
				opcao = scan.next();
			
				if(opcao.equalsIgnoreCase("Sim"))
				{
					condicao = true;
					break;
				}
			
				else if(opcao.equalsIgnoreCase("Nao"))
				{
					condicao = false;
					break;
				}
			
				else
					System.out.println("Opcao invalida");
			}
			
			i++;
		}
		
		media /= i;
		
		System.out.println("A menor temperatura eh: " + menor + "(°)");
		System.out.println("A maior temperatura eh: " + maior + "(°)");
		System.out.println("A media de temperaturas eh: " + media + "(°)");
		
		scan.close();
	}

}
