package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira F ou M de acordo com o seu sexo");
		
		String opcao = scan.next();
		
		if(opcao.equalsIgnoreCase("m"))
			System.out.print("Masculino");
		else if(opcao.equalsIgnoreCase("f"))
			System.out.print("Feminino");
		else
			System.out.print("Sexo Invalido");
		
		scan.close();
	}

}
