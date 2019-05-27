package cursojava.exercicios.lista7;

public class Aluno {
	
	String nome;
	String curso;
	String[] disciplinas;
	double[] notas;
	int matricula;

	void verificaAprovacao(double nota) {
		
		if(nota >= 7)
		{
			System.out.print("Aprovado");
			return;
		}
		
		System.out.print("Reprovado");
	}
}
