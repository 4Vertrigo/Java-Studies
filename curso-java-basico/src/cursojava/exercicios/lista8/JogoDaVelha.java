package cursojava.exercicios.lista8;

import java.util.Scanner;

public class JogoDaVelha {
	
	private char tabuleiro[][];
	private boolean vitoria;
	private int vez;
	
	public JogoDaVelha() {
		tabuleiro = new char[3][3];
		vitoria = false;
		vez = 0;
	}

	public JogoDaVelha(char[][] tabuleiro, boolean vitoria, int vez) {
		this.tabuleiro = tabuleiro;
		this.vitoria = vitoria;
		this.vez = vez;
	}

	public char[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public boolean isVitoria() {
		return vitoria;
	}

	public void setVitoria(boolean vitoria) {
		this.vitoria = vitoria;
	}

	public int getVez() {
		return vez;
	}

	public void setVez(int vez) {
		this.vez = vez;
	}
	
	public void setTabuleiroPosIJ(int i, int j, char conteudo) {
		this.tabuleiro[i][j] = conteudo;
	}
	
	public char getTabuleiroPosIJ(int i, int j) {
		return this.tabuleiro[i][j];
	}
	
	public void setTabuleiroPosI(int i, char[] conteudo) {
		this.tabuleiro[i] = conteudo;
	}
	
	public char[] getTabuleiroPosI(int i) {
		return this.tabuleiro[i];
	}
	
	public void preencheTabuleiro() {
		
		for(int i = 0; i < getTabuleiro().length; i++)
		{
			for(int j = 0; j < getTabuleiroPosI(i).length; j++)
				setTabuleiroPosIJ(i, j, '_');
		}
	}
	
	private void printaTabuleiro(){
		
		for(int i = 0; i < getTabuleiro().length; i++)
		{
			for(int j = 0; j < getTabuleiroPosI(i).length; j++)
					System.out.print("(" + i + "," + j + ") " + getTabuleiroPosIJ(i, j) + " ");
			
			System.out.println();
		}
	}
	
	private int verificaValidade(char coordenada, Scanner scan) {
		
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
	
	private void verificaVitoria(String jogador, char jogada) {
		
		if( (getTabuleiroPosIJ(0, 0) == jogada && getTabuleiroPosIJ(1, 1) == jogada && getTabuleiroPosIJ(2, 2) == jogada) ||
			(getTabuleiroPosIJ(0, 2) == jogada && getTabuleiroPosIJ(1, 1) == jogada && getTabuleiroPosIJ(2, 0) == jogada) ||
			(getTabuleiroPosIJ(0, 0) == jogada && getTabuleiroPosIJ(0, 1) == jogada && getTabuleiroPosIJ(0, 2) == jogada) ||
			(getTabuleiroPosIJ(1, 0) == jogada && getTabuleiroPosIJ(1, 1) == jogada && getTabuleiroPosIJ(1, 2) == jogada) ||
			(getTabuleiroPosIJ(2, 0) == jogada && getTabuleiroPosIJ(2, 1) == jogada && getTabuleiroPosIJ(2, 2) == jogada) ||
			(getTabuleiroPosIJ(0, 0) == jogada && getTabuleiroPosIJ(1, 0) == jogada && getTabuleiroPosIJ(2, 0) == jogada) ||
			(getTabuleiroPosIJ(0, 1) == jogada && getTabuleiroPosIJ(1, 1) == jogada && getTabuleiroPosIJ(2, 1) == jogada) ||
			(getTabuleiroPosIJ(0, 2) == jogada && getTabuleiroPosIJ(1, 2) == jogada && getTabuleiroPosIJ(2, 2) == jogada)
		  )
		{
			setVitoria(true);
			System.out.println("Vitoria do " + jogador);
		}
		
		else if(getVez() == 8) //numero maximo de jogadas para preencher o tabuleiro
		{
			setVitoria(true);
			System.out.println("Deu velha!");
		}
		
		printaTabuleiro();
	}
	
	public void realizaJogada(String jogador, char jogada, Scanner scan) {
		
		boolean jogadaValida = false;
		
		System.out.println("Escolha a posicao que voce jogara " + jogador);
		
		while(!jogadaValida)
		{
			printaTabuleiro();
			
			System.out.println("Insira um X e um Y valido no tabuleiro:");
			int x = verificaValidade('X', scan);
			int y = verificaValidade('Y', scan);
			
			if(getTabuleiroPosIJ(x, y) == '_')
			{
				setTabuleiroPosIJ(x, y, jogada);
				jogadaValida = true;
			}
			else
				System.out.println("Jogada invalida, tente novamente!");
		}
		
		verificaVitoria(jogador, jogada);
	}
}
