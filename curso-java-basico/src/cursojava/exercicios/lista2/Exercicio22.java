package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a quantidade em kg de morango e em seguida a quantidade de maca");
		
		int kgMorango = scan.nextInt();
		int kgMaca = scan.nextInt();
		double preco;
		double desconto = 0;
		
		if(kgMorango > 8 || kgMaca > 8)
			desconto = 0.1;
		
		preco = kgMorango * (2.5 - (2.5 * desconto)) + kgMaca * (1.8 - (1.8 * desconto));
		
		if(preco > 25)
			preco = preco - (preco * 0.1);
		
		System.out.printf("O valor a ser pago eh R$ %.2f", preco);
		scan.close();
		
	}

}
