package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int contador = 0;
		String resposta;
		
		System.out.println("Responda \"Sim\" ou \"Nao\" para as seguintes perguntas a baixo);");
		
		System.out.println("Telefonou para a vitima?");
		
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim"))
			contador++;
		
		System.out.println("Esteve no local do crime?");
		
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim"))
			contador++;
		
		System.out.println("Mora perdo da vitima?");
		
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim"))
			contador++;
		
		System.out.println("Ja trabalhou com a vitima?");
		
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim"))
			contador++;
		
		if(contador == 4)
			System.out.println("Assasino");
		else if(contador >= 2)
			System.out.println("Cumplice");
		else if (contador == 1)
			System.out.println("Suspeita");
		else
			System.out.println("Inocente");
		
		
		
		
		scan.close();
	}

}
