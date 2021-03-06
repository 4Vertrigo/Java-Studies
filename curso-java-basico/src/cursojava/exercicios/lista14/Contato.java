package cursojava.exercicios.lista14;

public class Contato {
	
	private String nome;
	private String telefone;
	private int identificador;
	
	public Contato(String nome, String telefone, int contador) {
		identificador = contador;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdentificador() {
		return identificador;
	}

	@Override
	public String toString() {
		String s = "[";
		s += "Id: " + getIdentificador();
		s += ", Nome: " + getNome();
		s += ", Telefone: " + getTelefone();
		s += "]";
		return s;
	}
	
	
	
	

}
