package cursojava.exercicios.lista14;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcao = 1;
		Agenda agenda = new Agenda();
		
		while(opcao != 3)
		{
			opcao = obterOpcaoMenu(scan);
			switch (opcao) 
			{
				case 1:
					consultarContato(scan, agenda);
				break;
				
				case 2:
					adicionarContato(scan, agenda);
				break;
			}
		}
	}
	
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		
		System.out.println("Criando um contato, entre com as informacoes");
		String nome = leInformacaoString(scan, "Entre com o nome do contato");
		String telefone = leInformacaoString(scan, "Entre com o telefone do contato");
		
		Contato contato = new Contato(nome, telefone, agenda.getContador());
		System.out.println("Contato a ser criado: ");
		System.out.println(contato);
		
		try 
		{
			agenda.adicionarContato(contato);
		} 
		catch (AgendaCheiaException e) 
		{	
			System.out.println(e.getMessage());
			
			System.out.println("Contatos da agenda");
			System.out.println(agenda);
		}
	}
	public static void consultarContato(Scanner scan, Agenda agenda) {
		
		String nomeContato = leInformacaoString(scan, "Entre com o nome do contato");
		try
		{
			if(agenda.consultaContato(nomeContato) >= 0)
			System.out.println("Contato existe");
		}
		catch(ContatoNaoExisteException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static String leInformacaoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}
	
	public static int obterOpcaoMenu(Scanner scan) {
		
		boolean entradaValida = false;
		int opcao = 3;
		String entrada;
		
		while(!entradaValida) {
			System.out.println("Digite a opcao desejada: ");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar contato");
			System.out.println("3: Sair");
			
			try 
			{
				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if(opcao < 1 || opcao > 3)
					throw new Exception("Entrada invalida");
				else
					entradaValida = true;
			}
			catch(Exception e)
			{
				System.out.println("Entrada invalida, digite novamente\n");
			}
		}
		
		
		return opcao;
	}

}
