package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira os valores de \"a b c\" da equacao de segundo grau(ax2 + bx + c)");
		
		double a = scan.nextDouble();
		
		if(a == 0)
			System.out.println("a = 0 nao define uma equacao de segundo grau");
		else
		{
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double raiz1;
			double raiz2;
			
			double delta = Math.pow(b, 2) - 4 * a * c;
			
			if(delta < 0)
				System.out.println("A equacao nao possui raizes reais pois delta = " + delta);
			else if(delta == 0)
			{
				raiz1 = -b / 2*a;
				
				System.out.println("A equacao possui apenas uma raiz pois delta = " + delta + " e a raiz eh: "+ raiz1);
			}
			
			else
			{
				raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
				raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
				
				System.out.println("A equacao possui raizes " + raiz1 + " " + raiz2);
			}
		}
		
		
		
		scan.close();
	}
}
