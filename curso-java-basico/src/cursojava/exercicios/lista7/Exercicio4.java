package cursojava.exercicios.lista7;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		JogoDaVelha jogo = new JogoDaVelha();
		
		Scanner scan = new Scanner(System.in);
		
		jogo.tabuleiro = new char[3][3];
		jogo.vitoria = false;
		jogo.vez = 0;
		
		System.out.println("Bem vindo ao jogo da velha!");
		System.out.println("Jogador 1 - X");
		System.out.println("Jogador 2 - O");
		
		jogo.preencheTabuleiro();
		
		while(!jogo.vitoria)
		{
			if(jogo.vez % 2 == 0)
				jogo.realizaJogada("Jogador 1", 'X', scan);
			else
				jogo.realizaJogada("Jogador 2", 'O', scan);
			
			jogo.vez++;
		}
		
		scan.close();
	}

}
