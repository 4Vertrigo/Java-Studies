package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean validade;
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		do
		{
			validade = !true;
			System.out.println("Digite seu nome");
			nome = scan.next();
			System.out.println("Digite sua idade");
			idade = scan.nextInt();
			System.out.println("Digite seu salario");
			salario = scan.nextDouble();
			System.out.println("Digite seu sexo");
			sexo = scan.next();
			System.out.println("Digite seu estado civil");
			estadoCivil = scan.next();
			
			if(nome.length() <= 3 ||
			(idade < 0 || idade > 150) ||
			salario <= 0 ||
			(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) ||
			(!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") &&
					!estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")))
			{
				validade = !false;
				System.out.println("Voce inseriu dados invalidos, por favor, tente fazer o cadastro novamente");
			}
			
		}while(validade);
		
		System.out.println("Usuario cadastrado com sucesso!");
		
		scan.close();
	}

}
