package cursojava.exercicios.lista8;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		JogoDaVelha jogo = new JogoDaVelha();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem vindo ao jogo da velha!");
		System.out.println("Jogador 1 - X");
		System.out.println("Jogador 2 - O");
		
		jogo.preencheTabuleiro();
		
		while(!jogo.isVitoria())
		{
			if(jogo.getVez() % 2 == 0)
				jogo.realizaJogada("Jogador 1", 'X', scan);
			else
				jogo.realizaJogada("Jogador 2", 'O', scan);
			
			jogo.setVez(jogo.getVez() + 1);
		}
		
		scan.close();
	}

}
