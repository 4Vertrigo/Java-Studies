package cursojava.exercicios.lista11;

public class Contato {
	
	private String nome;
	private String telefone;
	private String email;
	
	public Contato() {
		// TODO Auto-generated constructor stub
	}
	
	public Contato(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String retornaContato() {
		return "Nome: " + getNome() + "\nTelefone: " + getTelefone() + "\nE-mail: " + getEmail() + "\n";
	}

}
