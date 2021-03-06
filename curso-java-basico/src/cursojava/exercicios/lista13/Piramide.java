package cursojava.exercicios.lista13;

public class Piramide extends Figura3D {

	private double altura;
	private double arestaBase;
	private double apotemaLateral;
	private int numPoliBase;
	
	private Figura2D base;
	
	public Piramide() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Piramide(double altura, double arestaBase, double apotemaLateral, Figura2D base, int numPoliBase, String nome, String cor) {
		super(nome, cor);
		this.altura = altura;
		this.arestaBase = arestaBase;
		this.apotemaLateral = apotemaLateral;
		this.base = base;
		this.numPoliBase = numPoliBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotemaLateral() {
		return apotemaLateral;
	}

	public void setApotemaLateral(double apotemaLateral) {
		this.apotemaLateral = apotemaLateral;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	public int getNumPoliBase() {
		return numPoliBase;
	}

	public void setNumPoliBase(int numPoliBase) {
		this.numPoliBase = numPoliBase;
	}

	@Override
	public double calcularVolume() {
		if(base != null)
			return (base.calcularArea() * getAltura()) / 3;
		return 0;
	}

	@Override
	public double calcularArea() {
		if(base != null)
			return getNumPoliBase() * ((getArestaBase() * getApotemaLateral())/2.0) + base.calcularArea();
		return 0;
	}

}
