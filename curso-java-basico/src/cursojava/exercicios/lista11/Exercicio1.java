package cursojava.exercicios.lista11;

import java.util.Scanner;

public class Exercicio1 {
	
	private static final int NUMCONTATOS = 3;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem vindo a Agenda!");
		
		System.out.println("Insira o nome da sua agenda");
		
		String nomeAgenda = scan.nextLine();
		Contato[] contatos = new Contato[NUMCONTATOS];
		String nome;
		String telefone;
		String email;
		
		for(int i = 0; i < NUMCONTATOS; i++)
		{
			System.out.print("Insira o nome do contato " + (i+1) + ": ");
			nome = scan.nextLine();
			System.out.print("Insirao o telefone dele: ");
			telefone = scan.nextLine();
			System.out.print("Por fim, insira o email: ");
			email = scan.nextLine();
			contatos[i] = new Contato(nome, telefone, email);
		}
		
		Agenda dados = new Agenda(nomeAgenda, contatos);
		
		System.out.println(dados.retornaAgenda());
		
		scan.close();
	}

}
