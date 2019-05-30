package cursojava.aulas.aula19;

public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;
	
	public void verificarAcesso() {
		
		//super.nome = "Maria"; atributo protect, acao invalida!
		//super.nomeVisibilidade = "Maria"; atributo default, visivel em todo o pacote
		//super.nomeVisivel = "Maria'; atributo public, todo mundo consegue ver, ate mesmo outros pacotes
		//super.nomeProtect = "Maria"; atributo protected, funciona como um default, mas as subclasses, mesmo que estejam em outros pacotes, conseguem ver
	}
	
	
	public Aluno() {
		super(); //chamando o construtor da super classe (ou da classe mae)
		// TODO Auto-generated constructor stub
	}
	
	
	public Aluno(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificaAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		
		super.setCpf("154544448");
		//tanto faz, os dois estao certos
		this.setCpf("488848484");
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endereco do Aluno: " + super.getEndereco();
		
		return s;
	}


	@Override
	public String irUniversidade() {
		
		return "O aluno vai a universidade estudar";
	}

}
