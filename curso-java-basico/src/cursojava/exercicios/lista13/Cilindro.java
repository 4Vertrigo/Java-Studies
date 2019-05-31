package cursojava.exercicios.lista13;

public class Cilindro extends Figura3D {

	private double raio;
	private double altura;
	
	public Cilindro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cilindro(double raio, double altura, String nome, String cor) {
		super(nome, cor);
		this.raio = raio;
		this.altura = altura;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {
		return Math.PI * Math.pow(getRaio(), 2) * getAltura();
	}

	@Override
	public double calcularArea() {

		double areaBase = Math.PI * Math.pow(getRaio(), 2);
		double areaLateral = 2 * Math.PI * getAltura();
		return 2 * areaBase + areaLateral;
	}

}
