package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a mensagem conforme o periodo que voce estuda:");
		System.out.println("M-Matutino");
		System.out.println("V-Vespertino");
		System.out.println("N-Noturno");
		
		String mensagem = scan.next();
		
		if(mensagem.equalsIgnoreCase("M"))
			System.out.println("Bom dia");
		else if(mensagem.equalsIgnoreCase("V"))
			System.out.println("Bom tarde");
		else if(mensagem.equalsIgnoreCase("N"))
			System.out.println("Boa noite");
		else
			System.out.println("Entrada invalida");
		
		scan.close();
	}
}
