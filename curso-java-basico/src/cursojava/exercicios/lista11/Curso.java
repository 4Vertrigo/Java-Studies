package cursojava.exercicios.lista11;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor docente;
	private Aluno[] alunos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getDocente() {
		return docente;
	}
	public void setDocente(Professor docente) {
		this.docente = docente;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public String obterInfo() {
		String info = nome + " " + horario + "\n";
		
		if(docente != null)
			info += docente.obterInfo();
		if(alunos != null)
		{
			for(Aluno aluno: alunos)
			{
				if(aluno != null)
					info += aluno.obterInfo();
			}
		}
		
		return info;
	}

}
