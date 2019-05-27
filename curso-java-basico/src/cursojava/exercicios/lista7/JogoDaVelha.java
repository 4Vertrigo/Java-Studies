package cursojava.exercicios.lista7;

import java.util.Scanner;

public class JogoDaVelha {

	char tabuleiro[][];
	boolean vitoria;
	int vez;
	
	
	void preencheTabuleiro() {
		
		for(int i = 0; i < tabuleiro.length; i++)
		{
			for(int j = 0; j < tabuleiro[i].length; j++)
				tabuleiro[i][j] = '_';
		}
	}
	
	void printaTabuleiro(){
		
		for(int i = 0; i < tabuleiro.length; i++)
		{
			for(int j = 0; j < tabuleiro[i].length; j++)
					System.out.print("(" + i + "," + j + ") " + tabuleiro[i][j] + " ");
			
			System.out.println();
		}
		
	}
	
	int verificaValidade(char coordenada, Scanner scan) {
		
		boolean valido = false;
		int coordenadaValor = -1;
		
		while(!valido)
		{
			System.out.print(coordenada + ": ");
			coordenadaValor = scan.nextInt();
			
			if(coordenadaValor >= 0 && coordenadaValor <= 2)
				valido = true;
			else
				System.out.println(coordenada + " invalido!");
		}
		
		return coordenadaValor;
	}
	
	void verificaVitoria(String jogador, char jogada) {
		
		if( (tabuleiro[0][0] == jogada && tabuleiro[1][1] == jogada && tabuleiro[2][2] == jogada) ||
			(tabuleiro[0][2] == jogada && tabuleiro[1][1] == jogada && tabuleiro[2][0] == jogada) ||
			(tabuleiro[0][0] == jogada && tabuleiro[0][1] == jogada && tabuleiro[0][2] == jogada) ||
			(tabuleiro[1][0] == jogada && tabuleiro[1][1] == jogada && tabuleiro[1][2] == jogada) ||
			(tabuleiro[2][0] == jogada && tabuleiro[2][1] == jogada && tabuleiro[2][2] == jogada) ||
			(tabuleiro[0][0] == jogada && tabuleiro[1][0] == jogada && tabuleiro[2][0] == jogada) ||
			(tabuleiro[0][1] == jogada && tabuleiro[1][1] == jogada && tabuleiro[2][1] == jogada) ||
			(tabuleiro[0][2] == jogada && tabuleiro[1][2] == jogada && tabuleiro[2][2] == jogada)
		  )
		{
			vitoria = true;
			System.out.println("Vitoria do " + jogador);
		}
		
		else if(vez == 8) //numero maximo de jogadas para preencher o tabuleiro
		{
			vitoria = true;
			System.out.println("Deu velha!");
		}
		
		printaTabuleiro();
	}
	
	void realizaJogada(String jogador, char jogada, Scanner scan) {
		
		boolean jogadaValida = false;
		
		System.out.println("Escolha a posicao que voce jogara " + jogador);
		
		while(!jogadaValida)
		{
			printaTabuleiro();
			
			System.out.println("Insira um X e um Y valido no tabuleiro:");
			int x = verificaValidade('X', scan);
			int y = verificaValidade('Y', scan);
			
			if(tabuleiro[x][y] == '_')
			{
				tabuleiro[x][y] = jogada;
				jogadaValida = true;
			}
			else
				System.out.println("Jogada invalida, tente novamente!");
		}
		
		verificaVitoria(jogador, jogada);
	}
}
