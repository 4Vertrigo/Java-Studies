package cursojava.exercicios.lista12.exercicio2;

public class PessoaJuridica extends Contribuente{

	private String cnpj;
	
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
		super(nome, rendaBruta);
		this.cnpj = cnpj;
		// TODO Auto-generated constructor stub
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void impostoDeRenda() {
		
		double imposto = super.getRendaBruta() * 0.1;
		System.out.println("O imposto a ser pago eh de: " + imposto);
	}
	

}
