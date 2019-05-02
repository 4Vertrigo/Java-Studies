package cursojava.exercicios.lista2;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira os tres lados do triangulo:");
		int lado1 = scan.nextInt();
		int lado2 = scan.nextInt();
		int lado3 = scan.nextInt();
		
		if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)
		{
			if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3)
				System.out.println("Triangulo Equilatero");
			else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
				System.out.println("Triangulo Isoceles");
			else
				System.out.println("Triangulo Escaleno");
		}
		
		else
			System.out.println("Os lados inseridos nao podem ser um triangulo");
		
		scan.close();
	}
}
