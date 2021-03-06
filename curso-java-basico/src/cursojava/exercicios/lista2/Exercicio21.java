package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite A-alcool e G-gasolina");
		
		String opcao = scan.next();
		
		System.out.println("Insira quantos litros voce quer colocar");
		double litros = scan.nextDouble();
		
		
		double precoFinal = 0;
		double precoLitro;
		double desconto;
		
		switch (opcao) 
		{
			case "A":
				
				if(litros > 20)
					desconto = 0.05;
				else
					desconto = 0.03;
				
				precoLitro = 2.5 - (2.5 * desconto);
				precoFinal = precoLitro * litros;
				break;
			
			case "G":

				if(litros > 20)
					desconto = 0.06;
				else
					desconto = 0.04;
				
				precoLitro = 1.9 - (1.9 * desconto);
				precoFinal = precoLitro * litros;
				break;
			default:
				System.out.println("Opcao invalida");
				System.exit(0);
		}
		
		System.out.println("O valor a ser pago eh R$ " + precoFinal);
		
		scan.close();
	}

}
