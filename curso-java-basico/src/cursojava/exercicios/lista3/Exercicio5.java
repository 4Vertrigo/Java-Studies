package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int populacaoA;
		int populacaoB;
		int ano;
		double taxaA;
		double taxaB;
		boolean condicao;
		String opcao;
		
		do
		{
			do
			{
				condicao = false;
				populacaoA = 80000;
				populacaoB = 200000;
				ano = 0;
				
				System.out.println("Insira a taxa de crescimento da populacao do pais A em %");
				taxaA = scan.nextDouble();
				
				if(taxaA <= 0 || taxaA > 100)
				{
					System.out.println("A taxa de crescimento eh invalida, por favor tente novamente");
					condicao = true;
				}
				
				else
					taxaA /= 100;
			}while(condicao);
			
			do
			{
				condicao = false;
				
				System.out.println("Insira a taxa de crescimento da populacao do pais B em %");
				taxaB = scan.nextDouble();
				
				if(taxaB <= 0 || taxaB > 100)
				{
					System.out.println("A taxa de crescimento eh invalida, por favor tente novamente");
					condicao = true;
				}
				
				else
					taxaB /= 100;
			}while(condicao);
			
			while(populacaoA <= populacaoB)
			{
				populacaoA += (populacaoA * taxaA);
				populacaoB += (populacaoB * taxaB);
				ano++;
				
				System.out.println("Estamos no ano " + ano + " e as populacoes estao assim:");
				System.out.println("Populacao do pais A " + populacaoA + " Populacao do pais B " + populacaoB);
			}
			
			do
			{
				System.out.println("Deseja fazer a operacao novamente? Digite Sim ou Nao");
				opcao = scan.next();
			
				if(opcao.equalsIgnoreCase("Sim"))
				{
					condicao = true;
					break;
				}
				
				else if(opcao.equalsIgnoreCase("Nao"))
				{
					System.out.println("Encerrando o programa!");
					condicao = false;
					break;
				}
				
				else
				{
					System.out.println("Opcao invalida, por favor, tente novamente");
					continue;
				}
				
			}while(true);
			
		}while(condicao);
		
		scan.close();
	}
}
