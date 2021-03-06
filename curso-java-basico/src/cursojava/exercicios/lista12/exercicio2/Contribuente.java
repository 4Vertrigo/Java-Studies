package cursojava.exercicios.lista12.exercicio2;

public abstract class Contribuente {

	private String nome;
	private double rendaBruta;
	
	public Contribuente() {

	}
	
	public Contribuente(String nome, double rendaBruta) {
		this.nome = nome;
		this.rendaBruta = rendaBruta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public abstract void impostoDeRenda();
		
}
