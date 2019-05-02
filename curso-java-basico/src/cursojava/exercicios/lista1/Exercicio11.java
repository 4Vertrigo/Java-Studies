package cursojava.exercicios.lista1;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro:");
		int primeiroInteiro = scan.nextInt();
		System.out.println("Insira o segundo inteiro:");
		int segundoInteiro = scan.nextInt();
		System.out.println("Agora insira um numero real");
		double numeroReal = scan.nextDouble();
		
		double resultados;
		
		resultados = (primeiroInteiro * 2) * (segundoInteiro / 2);
		System.out.println("O produto do dobro do primeiro inteiro com metade do segundo inteiro eh : " + resultados);
		resultados = (3 * primeiroInteiro) + numeroReal;
		System.out.println("A soma do triplo do primeiro com o numero real eh " + resultados);
		resultados = Math.pow(numeroReal, 3);
		System.out.println("O numero real elevado ao cubo eh: " + resultados);
		
		scan.close();
	}

}
