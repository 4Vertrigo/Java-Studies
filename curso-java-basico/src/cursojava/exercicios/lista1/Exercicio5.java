package cursojava.exercicios.lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de metros que queres converter: ");
		
		float metros = scan.nextFloat();
		float centimetros = metros * 100f;
		
		System.out.println(metros + "m = " + centimetros + "cm");
		
		scan.close();
	}

}
