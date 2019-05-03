package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o numero de turmas que voce ira forncecer");
		int numTurmas = scan.nextInt();
		int numAlunos = 0;
		int media = 0;
		
		for(int i = 1; i <= numTurmas; i++)
		{
			System.out.println("Insira o numero de alunos da turma " + i);
			
			while(true)
			{
				numAlunos = scan.nextInt();
				
				if(numAlunos <= 0 || numAlunos > 40)
					System.out.println("Numero inserido invalido, por favor, tente novamente");
				else break;
			}
				
			media += numAlunos;
		}
		
		media /= numTurmas;
		
		System.out.println("A media de alunos eh de: " + media);
		
		scan.close();
	}

}
