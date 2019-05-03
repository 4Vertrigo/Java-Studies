package cursojava.exercicios.lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o salario inicial:");
		double salario = scan.nextDouble(); //em 1995
		double percentual = 0.015;
		
		salario += (salario * percentual); //em 1996
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for(int i = 1997; i <= 2019; i++)
		{
			percentual *= 2;
			System.out.println("Salario atual: " + percentual);
			salario = salario + (salario * percentual);
			System.out.println(i + " = " + format.format(salario) + " - " + format.format(percentual * 100) + "%");
		}
		
		scan.close();
	
	}

}
