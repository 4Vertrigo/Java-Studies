package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero que se deseja saber se eh primo:");
		int num = scan.nextInt();
		boolean primo = true;
		
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				primo = false;
				break;
			}
		}
		
		if(primo)
			System.out.println(num + " eh primo");
		else
			System.out.println(num + " nao eh primo");
		
		scan.close();
		
	}

}
