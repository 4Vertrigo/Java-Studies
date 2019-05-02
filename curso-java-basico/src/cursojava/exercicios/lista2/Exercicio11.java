package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu salario");
		
		double salarioAntigo = scan.nextDouble();
		double salarioNovo;
		System.out.printf("Salario antigo: %.2f\n", salarioAntigo);
		
		if(salarioAntigo <= 280)
		{
			salarioNovo = salarioAntigo + (salarioAntigo * 0.2);
			
			System.out.println("Porcentual: 20%"); 
		}
		
		else if(salarioAntigo < 700)
		{
			salarioNovo = salarioAntigo + (salarioAntigo * 0.15);
			
			System.out.println("Porcentual: 15%"); 
		}
		
		else if(salarioAntigo < 1500)
		{
			salarioNovo = salarioAntigo + (salarioAntigo * 0.1);
			
			System.out.println("Porcentual: 10%");
		}
		
		else
		{
			salarioNovo = salarioAntigo + (salarioAntigo * 0.05);
			
			System.out.println("Porcentual: 5%");
		}
		
		
		System.out.printf("Valor do aumento: %.2f\nNovo Salario: %.2f", salarioNovo - salarioAntigo, salarioNovo);
		scan.close();
	}

}
