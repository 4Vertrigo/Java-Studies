package cursojava.exercicios.lista12.exercicio3;

public class Mamifero extends Animal{
	
	private String alimento;

	public Mamifero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, String alimento) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.alimento = alimento;
		// TODO Auto-generated constructor stub
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAlimento: " + alimento;
	}

}
