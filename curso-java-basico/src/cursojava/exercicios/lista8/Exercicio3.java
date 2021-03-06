package cursojava.exercicios.lista8;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Insira as informacoes do aluno abaixo");
		System.out.print("Nome: ");
		aluno.setNome(scan.nextLine());
		System.out.print("Matricula: ");
		aluno.setMatricula(scan.nextInt());
		scan.nextLine();
		System.out.print("Curso: ");
		aluno.setCurso(scan.nextLine());
		
		aluno.setDisciplinas(new String[3]);
		aluno.setNotas(new double[3]);
		
		for(int i = 0; i < aluno.getDisciplinas().length; i++)
		{
			System.out.print("Insira o nome da disciplina: ");
			aluno.getDisciplinas()[i] = scan.nextLine();
			System.out.print("Insira a nota nessa disciplina: ");
			aluno.getNotas()[i] = scan.nextDouble();
			scan.nextLine();
		}
		
		for(int i = 0; i < aluno.getNotas().length; i++)
		{
			System.out.print("O aluno "+ aluno.getNome() +" foi ");
			aluno.verificaAprovacao(aluno.getNotas()[i]);
			System.out.println(" na disciplina de " + aluno.getDisciplinas()[i]);
		}
		
		scan.close();
	}

}
