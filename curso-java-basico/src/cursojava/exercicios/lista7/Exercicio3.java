package cursojava.exercicios.lista7;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Insira as informacoes do aluno abaixo");
		System.out.print("Nome: ");
		aluno.nome = scan.nextLine();
		System.out.print("Matricula: ");
		aluno.matricula = scan.nextInt();
		scan.nextLine();
		System.out.print("Curso: ");
		aluno.curso = scan.nextLine();
		
		aluno.disciplinas = new String[3];
		aluno.notas = new double[3];
		
		for(int i = 0; i < aluno.disciplinas.length; i++)
		{
			System.out.print("Insira o nome da disciplina: ");
			aluno.disciplinas[i] = scan.nextLine();
			System.out.print("Insira a nota nessa disciplina: ");
			aluno.notas[i] = scan.nextDouble();
			scan.nextLine();
		}
		
		for(int i = 0; i < aluno.notas.length; i++)
		{
			System.out.print("O aluno "+ aluno.nome +" foi ");
			aluno.verificaAprovacao(aluno.notas[i]);
			System.out.println(" na disciplina de " + aluno.disciplinas[i]);
		}
		
		scan.close();
	}

}
