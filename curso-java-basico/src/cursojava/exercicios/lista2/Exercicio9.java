package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tres numeros");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(""+ num1);
			
			if(num2 > num3)
			{
				System.out.println("" + num2);
				System.out.println("" + num3);
			}
			
			else
			{
				System.out.println("" + num3);
				System.out.println("" + num2);
			}
		}
		
		else if(num2 > num3)
		{
			System.out.println("" + num2);
			
			if(num3 > num1)
			{
				System.out.println("" + num3);
				System.out.println("" + num1);
			}
			
			else
			{
				System.out.println("" + num1);
				System.out.println("" + num3);
			}
			
			
		}
		
		else
		{
			System.out.println("" + num3);
			
			if(num2 > num1)
			{
				System.out.println("" + num2);
				System.out.println("" + num1);
			}
			
			else
			{
				System.out.println("" + num1);
				System.out.println("" + num2);
			}
		}
		
		scan.close();
	
	}

}
