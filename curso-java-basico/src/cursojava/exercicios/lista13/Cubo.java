package cursojava.exercicios.lista13;

public class Cubo extends Figura3D {
	
	private double aresta;
	
	public Cubo() {
		super();
	}

	public Cubo(double aresta, String nome, String cor) {
		super(nome, cor);
		this.aresta = aresta;
	}
	
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	@Override
	public double calcularVolume() {
		return Math.pow(aresta, 3);
	}

	@Override
	public double calcularArea() {
		return 6 * Math.pow(getAresta(), 2);
	}

}
