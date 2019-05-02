package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira quanto voce ganha por hora");
		double salario = scan.nextDouble();
		System.out.println("Insira quantas horas voce trabalha por dia");
		int horas = scan.nextInt();
		
		//supondo que um mes tem 4 semanas e, portanto 20 dias uteis
		
		salario = (salario * horas) * 20;
		System.out.printf("Salario Bruto :R$ %.2f\n", salario);
		
		int irP;
		
		if(salario <= 900)
			irP = 0;
		else if(salario <= 1500)
			irP = 5;
		else if(salario <= 2500)
			irP = 10;
		else
			irP = 20;
		
		double ir = (salario * irP)/ 100;
		double inss = salario * 0.1;
		double fgts = salario * 0.11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salario - (totalDescontos + fgts);
		
		System.out.printf("(-) IR (%d%%) :R$ %.2f\n", irP, ir);
		System.out.printf("(-) INSS (10%%) :R$ %.2f\n", inss);
		System.out.printf("FGTS (11%%) :R$ %.2f\n", fgts);
		System.out.printf("Total de descontos :R$ %.2f\n", totalDescontos);
		System.out.printf("Salario Liquido :R$ %.2f\n", salarioLiquido);
		
		scan.close();
	}

}
