package cursojava.exercicios.lista11;

import java.util.Scanner;

public class Exercicio2 {

	public static final int NUMALUNOS = 5;
	public static final int NUMNOTAS = 4;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bem vindo ao sistema de cadastro JupiterWeb!");
		
		Curso disciplina = new Curso();
		
		System.out.println("Insira o nome desta disciplina");
		disciplina.setNome(scan.nextLine());
		System.out.println("Insira o horario desta disciplina");
		disciplina.setHorario(scan.nextLine());
		
		Professor docente = new Professor();
		System.out.println("Insira o nome do docente responsavel por ministrar as aulas desta disciplina");
		docente.setNome(scan.nextLine());
		System.out.println("Insira o departamento dele");
		docente.setDepartamento(scan.nextLine());
		System.out.println("Insira o email dele");
		docente.setEmail(scan.nextLine());
		disciplina.setDocente(docente);
		
		Aluno[] alunos = new Aluno[NUMALUNOS];
		int[][] notas = new int[NUMALUNOS][NUMNOTAS];
		
		for(int i = 0; i < NUMALUNOS; i++)
		{
			alunos[i] = new Aluno();
			System.out.println("Matricule o aluno " + (i + 1) + "\n");
			System.out.println("Insira o nome: ");
			alunos[i].setNome(scan.nextLine());
			System.out.println("Insira o numero USP");
			alunos[i].setNumMatricula(scan.nextInt());
			scan.nextLine(); //removing the \n
			
			for(int j = 0; j < NUMNOTAS; j++)
			{
				System.out.println("Insira a nota " + (j+1) + " do aluno " + (i+1));
				notas[i][j] = scan.nextInt();
			}
			
			alunos[i].setNotas(notas[i]);
			scan.nextLine();
			
		}
		
		disciplina.setAlunos(alunos);
		
		
		System.out.println(disciplina.obterInfo());
		
		scan.close();
		
	}

}
