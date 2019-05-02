package cursojava.exercicios.lista1;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voce ganha por hora?");
		double salarioHora = scan.nextDouble();
		System.out.println("Quantas horas voce trabalha por dia?");
		double expediente = scan.nextDouble();
		
		//supondo que um mes possui 4 semanas e, portanto, 20 dias uteis
		
		double salarioMes = (salarioHora * expediente) * 20;
		double impostoDeRenda = salarioMes * 0.11;
		double inss = salarioMes * 0.08;
		double sindicato = salarioMes * 0.05;
		double salarioLiquido = salarioMes - (impostoDeRenda + inss + sindicato);
		
		System.out.printf("Salario Bruto: R$ %.2f\n", salarioMes);
		System.out.printf("IR: R$ %.2f\n", impostoDeRenda);
		System.out.printf("INSS: R$ %.2f\n", inss);
		System.out.printf("Sindicato: R$ %.2f\n", sindicato);
		System.out.printf("Saalrio Liquido: R$ %.2f", salarioLiquido);
		
		scan.close();
	}

}
