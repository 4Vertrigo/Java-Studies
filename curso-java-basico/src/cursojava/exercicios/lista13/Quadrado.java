package cursojava.exercicios.lista13;

public class Quadrado extends Figura2D {

	private double lado;
	
	public Quadrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quadrado(double lado, String nome, String cor) {
		super(nome, cor);
		this.lado = lado;
		// TODO Auto-generated constructor stub
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(getLado(), 2);
	}

}
