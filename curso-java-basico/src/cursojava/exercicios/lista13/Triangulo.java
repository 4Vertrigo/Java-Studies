package cursojava.exercicios.lista13;

public class Triangulo extends Figura2D {

	private double base;
	private double altura;
	
	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangulo(double base, double altura, String nome, String cor) {
		super(nome, cor);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (getBase() * getAltura())/2.0;
	}

}
