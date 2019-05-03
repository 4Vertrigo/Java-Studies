package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Montar tabuada de: ");
		int num = scan.nextInt();
		System.out.print("Comecar por: ");
		int min = scan.nextInt();
		System.out.print("Terminar por: ");
		int max = scan.nextInt();
		
		if(min > max)
		{
			System.out.println("Entradas invalidas, encerrando o programa");
			System.exit(0);
		}
			
		for(int i = min; i <= max; i++)
			System.out.println(num + " X " + i + " = " +(num * i));
		
		scan.close();
	}

}