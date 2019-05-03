package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Insira quantas pessoas voce ira forncecer");
		int numPessoas = scan.nextInt();
		int media = 0;
		
		for(int i = 1; i <= numPessoas; i++)
		{
			System.out.println("Insira a idade da pessoa " + i);
			media += scan.nextInt();
		}
		
		media /= numPessoas;
		
		if(media > 60)
			System.out.println("Turma idosa");
		else if(media > 25)
			System.out.println("Turma adulta");
		else
			System.out.println("Turma jovem");
		
		scan.close();
	}

}
