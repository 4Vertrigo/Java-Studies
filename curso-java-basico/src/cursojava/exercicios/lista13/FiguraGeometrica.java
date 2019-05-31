package cursojava.exercicios.lista13;

public abstract class FiguraGeometrica {
	
	private String nome;
	private String cor;
	
	public FiguraGeometrica() {
		// TODO Auto-generated constructor stub
	}
	
	public FiguraGeometrica(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}