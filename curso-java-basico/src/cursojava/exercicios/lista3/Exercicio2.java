package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean condicao;
		String nome;
		String senha;
		
		do
		{
			System.out.println("Insira seu nome de usuario");
			nome = scan.next();
			System.out.println("Insira sua senha");
			senha = scan.next();
			
			if(nome.equals(senha))
			{
				System.out.println("O nome de usuario nao pode ser igual a senha, por favor, tente novamente");
				condicao = true;
			}
			else
				condicao = false;
		}while(condicao);
		
		System.out.println("Usuario cadastrado com sucesso");
		
		scan.close();
	}

}
