package cursojava.exercicios.lista4;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[10];
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Insira as duas notas do aluno " + i);
			nota1[i] = scan.nextDouble();
			nota2[i] = scan.nextDouble();
			
			
			result[i] = (nota1[i] + nota2[i]) / (double) 2;
		}
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Status do aluno " + i + ": ");
			
			if(result[i] >= 7)
				System.out.println("APROVADO " + result[i]);
			else
				System.out.println("REPROVADO " + result[i]);
		}
		scan.close();
	}

}