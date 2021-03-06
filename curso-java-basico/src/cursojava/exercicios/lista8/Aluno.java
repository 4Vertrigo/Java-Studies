package cursojava.exercicios.lista8;

public class Aluno {
	
	private String nome;
	private String curso;
	private String[] disciplinas;
	private double[] notas;
	private int matricula;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nome, String curso, String[] disciplinas, double[] notas, int matricula) {
		this.nome = nome;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notas = notas;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void verificaAprovacao(double nota) {
		
		if(nota >= 7)
		{
			System.out.print("Aprovado");
			return;
		}
		
		System.out.print("Reprovado");
	}
}
