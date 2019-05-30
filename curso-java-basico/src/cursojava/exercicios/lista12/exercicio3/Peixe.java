package cursojava.exercicios.lista12.exercicio3;

public class Peixe extends Animal{
	
	private String caracteristicas;

	public Peixe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, String caracteristicas) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristicas = caracteristicas;
		// TODO Auto-generated constructor stub
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCaracteristicas: " + caracteristicas;
	}
	
	
}
