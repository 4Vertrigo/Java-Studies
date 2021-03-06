package cursojava.aulas.aula19;


//Eu poderia tambem usar a palavra chave final no lugar da abstract. Essa tag faz com que nao seja possivel
//criar filhos e editar o conteudo dessa classe. Dessa forma, consegue-se preservar a integridade de classes criadas.
//Imagine por exemplo se alguem der um extend da classe "String". Dessa forma, ela poderia acabar quebrando toda a classe
//ao utilizar algum metodo que altere os atributos dela.
public abstract class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	String nomeVisibilidade;
	public String nomeVisivel;
	protected String nomeProtect;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String obterEtiquetaEndereco() {
		return endereco;
	}
	
	public abstract String irUniversidade();
	
}
