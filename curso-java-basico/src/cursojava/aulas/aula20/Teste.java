package cursojava.aulas.aula20;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciencia da Computacao");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Ciencia da Computacao");
		double[] notas2 = {10, 9, 8, 7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
	}

}
