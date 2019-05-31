package cursojava.aulas.aula19;

public class Professor extends Pessoa{ //heranca, relacionamento eh filho de

	private double salario;
	private String nomeCurso;
	
	public Professor() {
		super(); //chamando o construtor da super classe (ou da classe mae)
		// TODO Auto-generated constructor stub
	}
	
	public Professor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endereco do Professor: " + super.getEndereco();
		
		return s;
	}

	@Override
	public String irUniversidade() {
		// TODO Auto-generated method stub
		return "O professor vai a universidade lecionar";
	}
	
}
