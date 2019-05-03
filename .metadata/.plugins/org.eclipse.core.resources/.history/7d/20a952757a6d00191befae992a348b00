package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {

		String opcao;
		boolean condicao = true;
		double valorTotal = 0;
		double valor;
		byte codigo;
		int quantidade;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Especificacao\tCodigo\tPreco");
		System.out.println("Cachorro Quente\t100\tR$ 1,20");
		System.out.println("Bauru Simples\t101\tR$ 1,30");
		System.out.println("Bauru com ovo\t102\tR$ 1,50");
		System.out.println("Hamburguer\t103\tR$ 1,20");
		System.out.println("Cheesburguer\t104\tR$ 1,30");
		System.out.println("Refrigerante\t105\tR$ 1,00");
		
		while(condicao)
		{
			System.out.println("Insira o codigo do protudo e, em seguida, quantas unidades voce quer dele");
			codigo = scan.nextByte();
			quantidade = scan.nextInt();
			valor = 0;
			
			switch (codigo) 
			{
				case 100:
					valor += 1.2 * quantidade;
					System.out.println("Cachorro Quente R$" + valor + "(" + quantidade + " unidades)");
					break;
				case 101:
					valor += 1.3 * quantidade;
					System.out.println("Bauru simples R$" + valor + "(" + quantidade + " unidades)");
					break;
				case 102:
					valor += 1.5 * quantidade;
					System.out.println("Bauru com ovo R$" + valor + "(" + quantidade + " unidades)");
					break;
				case 103:
					valor += 1.2 * quantidade;
					System.out.println("Hamburguer R$" + valor + "(" + quantidade + " unidades)");
					break;
				case 104:
					valor += 1.3 * quantidade;
					System.out.println("Cheesburguer R$" + valor + "(" + quantidade + " unidades)");
					break;
				case 105:
					valor += 1 * quantidade;
					System.out.println("Refrigerante R$" + valor + "(" + quantidade + " unidades)");
					break;

				default:
					System.out.println("Codigo invalido!");
					break;
			}
			
			valorTotal += valor;
			
			while(true)
			{
				System.out.println("Voce deseja pedir algo mais? Digite 'Sim' ou 'Nao'");
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
		}
		
		System.out.println("Valor total: R$ " + valorTotal);
		
		scan.close();
	}

}
