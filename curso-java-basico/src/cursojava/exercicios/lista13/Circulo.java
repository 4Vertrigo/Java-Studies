package cursojava.exercicios.lista13;

public class Circulo extends Figura2D {

	private double raio;
	
	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Circulo(double raio, String nome, String cor) {
		super(nome, cor);
		// TODO Auto-generated constructor stub
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(getRaio(), 2);
	}

}
